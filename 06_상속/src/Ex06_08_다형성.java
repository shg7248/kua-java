
class Car2 {
	String color = "white";
	int door = 4;
	
	void drive() {
		System.out.println("drive ~");
	}
	
	void stop() {
		System.out.println("stop!");
	}
	
} // Car2

class FireEngine extends Car2 {
	int door = 6;
	int wheel = 10;
	
	@Override
	void drive() { // 오버라이딩
		System.out.println("FEdrive ~");
	}
	
	void water() {
		System.out.println("water ~");
	}
}

public class Ex06_08_다형성 {
	public static void main(String[] args) {
		double x = 2.2;
		int y=1, z;
		
		x = y;			// 큰그릇에 작은그릇을 담는 경우 자동으로 타입이 변환 함 x = (double)y;		업캐스팅
		z = (int) x;	// 작은그릇에 큰그릇을 담는 경우 작은그릇의 타입을 명시해야 함					다운캐스팅

		Car2 c = new Car2();
		c.drive();
		c.stop();
		
		System.out.println();
		
		FireEngine f = new FireEngine();
		FireEngine f2 = null;

		f.drive();								// 자기것이 우선순위가 높음 
		f.water();
		System.out.println(f.door);
		System.out.println(f.color);
		
		c = f; // Car2 c = new FireEngine(); 	// 다형성 : 하나의 참조변수로 여러 타입의 객체를 참조할 수 있는 것 c = (Car2)f;
		System.out.println(c.door);
		System.out.println(c.color);
//		System.out.println(c.wheel);			// 부모 클래스인 Car2에는 wheel이라는 멤버변수가 없기 때문에 에러가 발생함
		
		c.drive();								// 자식이 오버라이딩을 하지 않을 경우 부모 클래스에 있는 메서드를 사용함
		
		if(c instanceof FireEngine) {
			System.out.println("다운캐스팅 가능");
			f2 = (FireEngine)c;
			System.out.println(f2.door);	// 4
			System.out.println(f2.color);	// white
			
			f2.drive();
			f2.stop();
		}
		else {
			System.out.println("다운캐스팅 불가능");
		}
	}
}
