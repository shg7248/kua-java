
//class Car {
//	
//	private String name;
//	private int len;
//	
//	Car(String name, int len) {
//		this.name = name;
//		this.len = len;
//	}
//	
//	void prnCar() {
//		System.out.println("이름 : " + name);
//		System.out.println("거리 : " + len);
//	}
//}

import com.javastudy.Car;
// import java.lang.Math;
// import java.lang.System;
import java.util.*; // 클래스만 *로 대신 할 수 있다.
// lang 패키지 안의 클래스들은 자주 사용하기 때문에 특별히 import를 하지 않고 사용할 수 있다.
// package는 import 위에 있어야 한다.

public class Ex06_07_import {
	public static void main(String[] args) {

		Car c = new Car("아반테", 3500);
		c.prnCar();
		
		System.out.println(Integer.MAX_VALUE);
		
		Scanner sc = new Scanner(System.in);
		
		Date d = new Date();
		System.out.println(d);
	}
}

/*
 * 		접근 제어자
 * 		public		: 모두 접근 가능
 * 		protected	: 같은 패키지 + 다른 패키지의 자손 클래스
 * 		default		: 같은 패키지
 * 		private		: 같은 클래스
 * 
 * 
 * 
 */
