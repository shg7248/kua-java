import java.util.Arrays;

public class MergeSort {
	
	public static int[] mergeSort(int[] arr) {
		
		int leng = arr.length;
		if(leng<2)
			return arr;
		int divide = leng / 2;

		int[] left = MergeSort.mergeSort(Arrays.copyOfRange(arr, 0, divide));
		int[] right = MergeSort.mergeSort(Arrays.copyOfRange(arr, divide, leng));
		
		int i=0,j=0;
		
		
		
		return null;
	}
	
	public static void main(String[] args) {
		int[] arr = {27,10,12,20,25,13,15,22};
		MergeSort.mergeSort(arr);
	}
}
