import java.util.Arrays;

public class Ex04_03 {
	public static void main(String[] args) {
		
		int[] arr = {10,9,8};
		int[] arr2 = new int[] {10,9,8};
		int[] arr3 = new int[3];
		arr3[0] = 10;
		arr3[1] = 9;
		arr3[2] = 8;
		
		int i;
		for(i=0;i<arr3.length;i++)
			System.out.println(arr3[i]);
		
		for(int j : arr3) {
			System.out.println(j);
		}
		
		for(i = 1; i<11; i++) {
			System.out.println(i + " : " + Arrays.binarySearch(arr, i));
		}
		
		
		
	}
}
