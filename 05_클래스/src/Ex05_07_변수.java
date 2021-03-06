
class Var {
	static int a;	// static 변수
	int b;			// instance 변수
	void increment() { // 메소드 정의
		int c = 0;	// 지역변수 (자동으로 초기화가 되지 않음)
		a++;
		b++;
		c++;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
	}
} // Var

public class Ex05_07_변수 {
	public static void main(String[] args) throws Exception { // 정의
		
		Var var1 = new Var();
		var1.increment();			// 1 1 1
		var1.increment();			// 2 2 1
		
		System.out.println();
		
		Var var2 = new Var();
		var2.increment();			// 3 1 1
		var2.increment();			// 4 2 1
		
		System.out.println();
		
		Var var3 = new Var();
		var3.increment();			// 5 1 1
		var3.increment();			// 6 2 1	
	}
}