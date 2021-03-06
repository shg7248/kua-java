import java.util.Scanner;

public class Ex05_10_송학관 {
	public static void main(String[] args) throws Exception { // 정의
	
		Scanner sc = new Scanner(System.in);
		
		// 정수 2개 입력
		int a, b;
		
		System.out.print("정수 입력 : ");
		a = sc.nextInt();
		
		System.out.print("정수 입력 : ");
		b = sc.nextInt();
		
		// 3 4 : 3의 4승
		int result = pow(a, b);
		System.out.println(a + " ^ " + b + " = " + result);
	}
	
	static int pow(int a, int b) {
		if(b == 0) return 1;
		return a * pow(a, --b);
	}
	
	static int recursive2(int x, int y) {
		int mul = 1;
		for(int i=1; i <= y; i++) {
			mul = mul * x;
		}
		return mul;
	}
}