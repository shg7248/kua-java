
class Parent {
	int x = 0;
	void method() {
		System.out.println("P_x : " + x);
	}
} // Parent

class Child extends Parent {
	int x = 20;
	void method() {
		int x = 30;	// 지역변수
		System.out.println("x : " + x);
		System.out.println("this.x : " + this.x);
		System.out.println("super.x : " + super.x);
		
		super.method();
	}
} // Child

public class Ex06_05_super {
	public static void main(String[] args) {

		Child c = new Child();
		c.method();
		
	}
}
