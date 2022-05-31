import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex07_05_예외처리 {
	public static void main(String[] args) {
		
		int answer = (int)(Math.random() * 100) + 1;
		int count = 0;
		
		do {
			System.out.print("1 ~ 100 사이의 값을 입력 : ");
			Scanner sc = new Scanner(System.in); // new InputMismatchException()
			int input = 0;
			
			try {
				input = sc.nextInt();
				if(input <= 0 || input > 100) {
					throw new InputMismatchException();
				}
			} catch(InputMismatchException e) {
				System.out.println("유요하지 않은 값입니다. 다시 입력하세요.");
				continue;
			}
			
			count++;
			
			if(answer > input) {
				System.out.println("더 큰수를 입력하세요");
			} 
			else if(answer < input) {
				System.out.println("더 작은수를 입력하세요");
			}
			else {
				System.out.println("정답입니다.");
				System.out.println("총 시도한 횟수는 " + count + "번 입니다");
				break;
			}
		} while(true);
		System.out.println("프로그램을 종료합니다.");
	}
}