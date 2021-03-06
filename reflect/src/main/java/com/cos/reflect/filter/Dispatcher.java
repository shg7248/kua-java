package com.cos.reflect.filter;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cos.reflect.anno.RequestMapping;
import com.cos.reflect.controller.UserController;

// 분기 시키기
public class Dispatcher implements Filter {

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain arg2)
			throws IOException, ServletException{
		HttpServletRequest request = (HttpServletRequest)req;
		HttpServletResponse response = (HttpServletResponse)resp;
		
		System.out.println("컨텍스트패스 : " + request.getContextPath());
		System.out.println("식별자주소 : " + request.getRequestURI());
		System.out.println("전체주소 : " + request.getRequestURL());
		
		// /user 파싱하기
		String endPoint = request.getRequestURI().replace(request.getContextPath(), "");
		System.out.println("엔드포인트 : " + endPoint);
		
		UserController userController = new UserController();
		
		Method[] methods = userController.getClass().getDeclaredMethods(); // 그 파일에 메서드만!!
		
		for(Method method : methods) {
			Annotation annotation = method.getDeclaredAnnotation(RequestMapping.class);
			RequestMapping requestMapping = (RequestMapping)annotation;
//			System.out.println(requestMapping.value());
			
			if(requestMapping.value().equals(endPoint)) {
				try {
					
					Parameter[] params = method.getParameters();
					Object dtoInstance = params[0].getType().newInstance();
					
					Method[] methods2 = dtoInstance.getClass().getDeclaredMethods();
					Arrays.sort(methods2, new 메소드정렬());
					String[] strs = new String[methods2.length];
					for(int i = 0; i < methods2.length; i++) {
						strs[i] = methods2[i].getName();
					}
					
					Enumeration<String> p = request.getParameterNames();
					
					while(p.hasMoreElements()) {
						String ele = p.nextElement();
						String first = ele.substring(0, 1).toUpperCase();
						String etc = ele.substring(1);
						String fullName = "set"+first+etc;	
						
						int idx = Arrays.binarySearch(strs, fullName);
						if(idx != -1) {
							methods2[idx].invoke(dtoInstance, request.getParameter(ele));
						}
					}

					String path = (String) method.invoke(userController, dtoInstance);
					
					RequestDispatcher dis = request.getRequestDispatcher(path); // 필터를 다시 안탐!!
					dis.forward(request, response);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			}
		}
	}
	
	private <T> void setData(T instance, HttpServletRequest request) {
		
	}

}

class 메소드정렬 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Method && o2 instanceof Method) {
			Method m1 = (Method)o1;
			Method m2 = (Method)o2;
			return m1.getName().compareTo(m2.getName());
		}
		return -1;
	}
	
}
