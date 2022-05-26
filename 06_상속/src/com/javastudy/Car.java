package com.javastudy;

public class Car {
	
	private String name;
	private int len;
	
	public Car(String name, int len) {
		this.name = name;
		this.len = len;
	}
	
	public void prnCar() {
		System.out.println("c.j.이름 : " + name);
		System.out.println("c.j.거리 : " + len);
	}
}