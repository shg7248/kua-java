
public class Ex05_09_재귀호출 {
	public static void main(String[] args) throws Exception { // 정의
		
		System.out.println("4 factorial : " + factorial(4));
		
	}
	
	static int factorial(int n) {
		
		if(n == 1) return n;
		
		return n * factorial(n - 1);
	}
}