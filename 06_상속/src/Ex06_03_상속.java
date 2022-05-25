
class Person2 {
	
	String name;
	int age;
	
	Person2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	void show() {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
	}
}

class Employee2 extends Person2 {

	String company;
	String title;
	
	Employee2(String name, int age, String company, String title) {
		super(name, age);
		this.company = company;
		this.title = title;
	}
	
	@Override
	void show() {
		super.show();
		System.out.println("company : " + company);
		System.out.println("title : " + title);
	}
} // Employee

public class Ex06_03_상속 {
	public static void main(String[] args) {
		
		Person2 p = new Person2("강호동", 48);
		Employee2 e = new Employee2("송은이", 21, "MBC", "과장");
		
		// show() 메서드 통해서 출력
		p.show();
		System.out.println();
		e.show();	
		
	}
}
