import java.util.Scanner;

public class Ex03_02_ifelse {
	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("데이터 입력 : ");
		int n = sc.nextInt();
		
	 // if(n == 1 || n == 2 || n == 3 || n == 10) { 조건을 모두 적기에 너무 많음
		if(n >= 1 && n <= 10) {
			System.out.println("입력한 숫자는 1 ~ 10 사이의 숫자입니다.");
		}
		else if (n >= 11 && n <= 20) {
			System.out.println("입력한 숫자는 11 ~ 20 사이의 숫자입니다.");
		}
		else {
			System.out.println("입력한 숫자는 1보다 작고 20보다 큰 숫자입니다.");
		}
		
		System.out.println("if ~ else 공부중");
		
		if(n % 5 == 0) { // 5의 배수
			System.out.println("5의 배수");
		}
		
		if(n % 10 == 0) { // 5의 배수일수도 10의 배수일수도 있으니 else를 사용하지 않음
			System.out.println("10의 배수");
		}
		
	}
}
