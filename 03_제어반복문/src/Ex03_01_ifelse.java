import java.util.Scanner;

public class Ex03_01_ifelse {
	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.print("숫자1 입력 : ");
		a = sc.nextInt();
		
		System.out.print("숫자2 입력 : ");
		b = sc.nextInt();
		
		if(a > b) { // 실행할 문장이 하나면 {}는 생략이 가능하다.
			System.out.println(a + "가 " + b + "보다 크다.");
			System.out.println("하하하");
		}
		
		else if(a < b) { 
			System.out.println(b + "가 " + a + "보다 크다.");
			System.out.println("호호호");
		}
		
//		else if(a == b) { 
		else { // 그 밖의 경우 (위 조건들이 모두 참이 아닐 경우)
			System.out.println(b + "가 " + a + "가 같다.");
			System.out.println("헤헤헤");
		}
		
		System.out.println("if 공부중");
	}
}

/*
 * 		조건식이 참이면 {} 안의 문장이 실행된다.
 * 		조건식이 참이 아니면 {} 안의 문장이 실행 안된다.
 * 		if(조건식) {
 *			실행할문장1;
 *			실행할문장2; 
 * 		}
 * 		else if(조건식) {
 * 			실행할문장1;
 * 			실행할문장2;
 * 		}
 * 		else {
 * 			실행할문장1;
 * 			실행할문장2;
 * 		}
 * 
 */
