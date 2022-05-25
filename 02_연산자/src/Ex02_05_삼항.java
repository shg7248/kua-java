
public class Ex02_05_삼항 {
	public static void main(String[] args) {
	
		// 조건문 ? 참일때 : 거짓일때
		
		int a = 10, b = 20;
		int result = a > b ? a : b;
		System.out.println("result : " + result);
		
		String s;
		s = a % 2 == 0 ? "짝수" : "홀수";
		System.out.println("s:"+s);
	}
}

/*
 * 		이항연산자
 * 		- % = += && || >= !=
 * 
 * 		단항연산자
 * 		- ++ == !
 * 
 */ 
