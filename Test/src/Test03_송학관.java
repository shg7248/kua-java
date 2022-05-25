import java.util.Scanner;

class Member {
	
	private String name;
	private int age;
	private double height;
	
	Member() {
		
	}
	
	Member(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	int getAge() {
		return age;
	}
	
	void setAge(int age) {
		this.age = age;
	}
	
	double getHeight() {
		return height;
	}
	
	void setHeight(double height) {
		this.height = height;
	}
	
	void show() {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("height : " + height);
	}
	
} // Member

public class Test03_송학관 {
	public static void main(String[] args) {
		
		Member m1 = new Member("박나래", 30, 172.9); // 생성자 통한 초기화
		Member m2 = new Member(); // 유재석, 50, 162.3 setter 통한 초기화
		
		m2.setName("유재석");
		m2.setAge(50);
		m2.setHeight(162.3);
		
		// m1 show() 한번에 출력
		m1.show();
		System.out.println();
		
		// m2 getter 출력
		System.out.println("name : " + m2.getName());
		System.out.println("age : " + m2.getAge());
		System.out.println("height : " + m2.getHeight());
		
	}
}



















