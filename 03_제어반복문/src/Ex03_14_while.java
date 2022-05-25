import java.util.Scanner;

public class Ex03_14_while {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int sum=0;
		
		while(true) {
			System.out.print("숫자를 입력하세요 >> ");
			int num = sc.nextInt();
			
			if(num<0)
				break;
			
			sum += num;	// 작성하는 위치도 신경써야 함!
		}
		
		System.out.println("입력한 숫자의 합 : " + sum);
	}
}
