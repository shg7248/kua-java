import java.util.Scanner;

public class Ex02_01_산술 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		int num1, num2;
		
		num1 = 10;
		num2 = 20;
		
		System.out.print("숫자1입력 : ");
		num1 = sc.nextInt();
		
		System.out.print("숫자2입력 : ");
		num2 = sc.nextInt();
		
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		System.out.println(num1 + " / " + num2 + " = " + ((double)num1 / num2));
		System.out.printf("%d / %d = %.2f\n", num1, num2, (double)num1/num2);
		System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));			// 나머지
		
	}
}
