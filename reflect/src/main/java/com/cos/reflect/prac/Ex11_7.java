package com.cos.reflect.prac;

import java.util.Arrays;
import java.util.Comparator;

public class Ex11_7 {
	public static void main(String[] args) {
		
		String[] strArr = {"cat", "Dog", "lion", "tiger"};
		
		Arrays.sort(strArr); // String의 Comparable구현에 의한 정렬
		System.out.println("strArr = " + Arrays.toString(strArr));
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분안함
		System.out.println("strArr = " + Arrays.toString(strArr));
		
		Arrays.sort(strArr, new Descending()); // 역순 정렬
		System.out.println("strArr = " + Arrays.toString(strArr));
		
		System.out.println(Integer.compare(1, 2));
		
	}
}

class Descending implements Comparator {

	// 양수 : 왼쪽이 큼
	// 같다
	// 음수 : 오른쪽이 큼
	
	@Override
	public int compare(Object o1, Object o2) {

		if(o1 instanceof Comparable && o2 instanceof Comparable ) {
			System.out.println(o1);
			System.out.println(o2);
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			return c1.compareTo(c2) * -1;
		}
		
		return 0;
	}
	
}

