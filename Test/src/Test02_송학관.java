import java.util.Scanner;

public class Test02_송학관 {
	public static void main(String[] args) {
		
		// 방5개 1차원 정수 배열에 입력(Scanner)하고
		// 합 출력
		// 숫자1: 11
		// 숫자2: 34
		// ...
		// 합: 123
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("숫자" + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}
		
		for(int i : arr) {
			sum += i;
		}
		
		System.out.println("합 : " + sum);
	}
}
