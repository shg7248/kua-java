
class Empl {
	
	private String name;
	private int age;
	
	Empl() {
		
	}
	
	Empl(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void display() {
		System.out.println(name);
		System.out.println(age);
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return this.name;
	}
	
	void setAge(int age) {
		this.age = age;
	}
	
	int getAge() {
		return this.age;
	}
}

public class Test04_송학관 {
	public static void main(String[] args) {
		
		Empl e1 = new Empl();
		e1.setName("kim");
		e1.setAge(30);
		e1.display();
		
		Empl e2 = new Empl("park", 20);
		System.out.println(e2.getName());
		System.out.println(e2.getAge());
		
	}
}



















