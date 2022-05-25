import java.util.Scanner;

public class Ex03_06_for {
	public static void main(String[] args) {
		// 1 ~ 10 출력
		int i;
		for(i=1;i<=10;i++) {
			if(i%2==0)
				System.out.println(i);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력 => ");
		int dan = sc.nextInt();
		if(dan%2==0) {
			for(i=1;i<=9;i++)
				System.out.println(dan+"*"+i+"="+(dan*i));
		}
		else {
			System.out.println("홀수단입니다.");
		}
	}
}
