
abstract class Shape { // 추상메서드가 있음을 알리기 위해 클래스 앞에도 abstract를 붙인다.
	
	// 자식 클래스에서 중요한 기능을 반드시 정의(완성)시키기 위한 목적으로 추상클래스를 사용한다.
	// 추상 클래스는 객체를 생성할 수 없다.
	
	Shape() {
		System.out.println("Shape 생성자");
	}
	
	void make() {
		System.out.println();
	}
	
	abstract void draw();	// 미완성 메서드 = 추상 메서드
	abstract void delete();
}

class Circle extends Shape {
	
	Circle() {
		System.out.println("Circle 생성자");
	}
	
	void draw() {
		System.out.println("원을 그린다.");
	}
	
	void delete() {
		System.out.println("원을 지운다.");
	}
}

class Rectangle extends Shape {

	Rectangle() {
		System.out.println("Recangle 생성자");
	}
	
	void draw() {
		System.out.println("사각형을 그린다.");
	}
	
	void delete() {
		System.out.println("사각형을 지운다.");
	}	
}

public class Ex06_10_추상클래스 {
	public static void main(String[] args) {
		
//		Shape s = new Shape();
		
		Shape c = new Circle();
		c.make();
		c.draw();
		c.delete();
		
		System.out.println("============");
		
		Shape r = new Rectangle();
		r.make();
		r.draw();
		r.delete();
		
		System.out.println("============");
		
		Shape[] arr = {new Circle(), new Rectangle()};
		for(Shape shape : arr) {
			shape.make();
			shape.draw();
			shape.delete();			
		}
		
	} // main
}
