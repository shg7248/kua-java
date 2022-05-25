
public class Ex05_12_overloading {
	public static void main(String[] args) throws Exception { // 정의

		int i = plus(3, 5, 10); 	// 메서드 호출
		float f = plus(.1f, .2f);
		double d = plus(1.1, 1.2);		
		
		System.out.println("int 합 : " + i);
		System.out.println("float 합 : " + f);
		System.out.println("double 합 : " + d);
	}
	
	public static int plus(int a, int b, int c) {
		return a + b + c;
	}
	
	public static float plus(float a, float b) {
		return a + b;
	}
	
	public static double plus(double a, double b) {
		return a + b;
	}
}

/*
	오버로딩(Overloading):
	하나의 메서드 이름으로 여러 개의 메서드를 만들 수 있는 기법
	
	오버로딩의 조건
	메서드 이름이 같아야 한다.
	매개변수의 개수와 자료형(타입)이 달라야 한다.
	(리턴 타입은 오버로딩의 조건에 포함되지 않는다.)
	오버로딩은 매개변수로만 구별된다.

*/