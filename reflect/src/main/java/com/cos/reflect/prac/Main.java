package com.cos.reflect.prac;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;

public class Main implements Comparable {
	public static void main(String[] args) {
		
		Class person = Person.class;
		Method[] methods = person.getDeclaredMethods();
		
		Arrays.sort(methods, new SongComp());
		
		String[] arr = new String[methods.length];
		for(int i = 0; i < methods.length; i++) {
			arr[i] = methods[i].getName();
		}
		
		System.out.println(Arrays.binarySearch(arr, "setName"));
	}

	@Override
	public int compareTo(Object o) {
		
		return 0;
	}
}

class SongComp implements Comparator {

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
