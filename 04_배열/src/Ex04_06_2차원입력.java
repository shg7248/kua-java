import java.util.Scanner;

public class Ex04_06_2차원입력 {
	public static void main(String[] args) {

		for(String arg : args) {
			System.out.println(arg);
		}
		
		int[][] arr = new int[2][3];
		
		Scanner sc = new Scanner(System.in);
		
		int i,j,sum=0;
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr[i].length;j++) {
				System.out.print("["+i+"]["+j+"] 입력 : ");
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		
		for(int[] x : arr) {
			for(int y : x) {
				System.out.print(y+"\t");
				sum+=y;
			}
			System.out.println(sum);
			sum=0;
		}
		
	}
}
