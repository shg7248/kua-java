import java.util.Scanner;

public class Ex07_02_예외처리 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.print("숫자1 입력 >> ");
		num1 = sc.nextInt();
		
		System.out.print("숫자2 입력 >> ");
		num2 = sc.nextInt();
		
		boolean div =  divider(num1, num2);
		if(div) 
			System.out.println("연산 성공");
		else 
			System.out.println("연산 실패");
		
		
	} // main

	static boolean divider(int x, int y) {
		try { // 예외처리
			int result = x / y;
			System.out.println("result : " + result);
			return true;
		} catch(ArithmeticException e) {
			System.out.println("젯수가 0이면 안됨");
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			return false;
		}
	}
} // class

//예외가 발생하면 예외 클래스 객체가 자동으로 생성된다.