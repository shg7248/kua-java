package 자바정리;

public class Person {
	
	private int no;
	private String name;
	private int age;
	
	Person(int no, String name, int age) {
		this.no = no;
		this.name = name;
		this.age = age;
	}
	
	public int getNo() {
		return this.no;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String toString() {
		return no + ", " + name + ", " + age;
	}
}
