
class Inner1 {
	int x = 2;
	void display() {
		System.out.println("x: " + x);
	}
} // Inner1

class Inner2 extends Inner1 {
	
	@Override
	void display() {
		System.out.println("x: " + x * x);
	}
} // Inner2 : Inner1을 새로 정의하기 위해 생성

public class Ex07_08_익명클래스 {
	public static void main(String[] args) {

		Inner1 i1 = new Inner1();
		i1.display();
		
		Inner2 i2 = new Inner2();
		i2.display();
		
		new Inner1() {
			
			@Override
			void display() {
				System.out.println("x: " + x * x * x);
			}			
		}.display();
		
		new Inner2() {
			
			@Override
			void display() {
				System.out.println("x: " + x * x);
			}
		}.display();
		
	}
}

// 
