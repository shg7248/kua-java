
// 저장됬냐

class Person {
	
	String name;
	int age;
	String addr;
	
	Person(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	void show() {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("addr : " + addr);
	}
}

class Employee extends Person {

	String company;
	String title;
	
	Employee(String name, int age, String addr, String company, String title) {
		super(name, age, addr);
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

class Student extends Person {

	String school;
	int kor;
	
	Student(String name, int age, String addr, String school, int kor) {
		super(name, age, addr);
		this.school = school;
		this.kor = kor;
	}
	
	@Override
	void show() {
		super.show();
		System.out.println("school : " + school);
		System.out.println("kor : " + kor);
	}
} // Student

public class Ex06_02_상속 {
	public static void main(String[] args) {
		
		Person p = new Person("강호동", 48, "부산");
		Employee e = new Employee("송은이", 21, "제주", "MBC", "과장");
		Student s = new Student("유재석", 87, "인천", "중앙고", 77);
		
		// show() 메서드 통해서 출력
		p.show();
		System.out.println();
		e.show();
		System.out.println();
		s.show();
		
		System.out.println("=======================================");
		
		Person[] person = 	{	new Person("강호동", 48, "부산"), 
								new Employee("송은이", 21, "제주", "MBC", "과장"), 
								new Student("유재석", 87, "인천", "중앙고", 77)};
							
		for(Person pp : person) {
			pp.show();
			System.out.println();
		}
	}
}
