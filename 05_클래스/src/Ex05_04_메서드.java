
class Calculator {
	
	int x;
	int y;
	
	// 두 수의 덧셈을 리턴하는 add 메서드 정의
	int add(int a, int b) {
		return a + b;
	}
	
	static int mul(int x, int y) {
		int result = x * y;
		return result;
	}
}

public class Ex05_04_메서드 {
	// 자바가상머신(JVM)에 의해서 main 메서드가 호출이 됨
	public static void main(String[] args) throws Exception { // 정의
		
		System.out.println(args[0]);
		
		Calculator cal = new Calculator();
		cal.x = 100;
		cal.y = 200;
		
		int result = cal.add(10, 20);
		System.out.println("result = " + result);
		
		// 5, 6의 곱셈이 출력되도록
		int result2 = Calculator.mul(5, 6);
		System.out.println("result2 = " + result2);
		
		int result3 = sub(100, 11, 22);
		System.out.println("result3 = " + result3);
		
		Ex05_04_메서드 e = new Ex05_04_메서드();
		int result4 = e.sub2(100, 11, 22);
		System.out.println("result4 = " + result4);
	}  // main 끝
	
	static int sub(int x, int y, int z) {
		int result = x - y - z;
		return result; // return 67
	} // sub 끝
	
	int sub2(int x, int y, int z) {
		int result = x - y - z;
		return result; // return 67
	} // sub2 끝
}

/*
		static 메서드에서는 static 메서드만 호출할 수 있다.
		static 메서드가 포함된 클래스의 객체를 만들어 메서드에 접근하면
		static 붙지 않은 메서드도 호출할 수 있다.
*/