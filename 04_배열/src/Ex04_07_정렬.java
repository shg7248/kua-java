
public class Ex04_07_정렬 {
	public static void main(String[] args) {

		int a=10, b=20, t=0;
		System.out.println(a+", "+b);
		t = b;
		b = a;
		a = t;
		System.out.println(a+", "+b);
		
		int[] arr = {8, 3, 5, 2, 9};
		
		for(int i : arr) {
			System.out.print(i+"\t");
		}
		
		System.out.println();
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}	
			}
			System.out.print(arr[i]+"\t");
		}
		
//		for(int i : arr) {
//			System.out.print(i+"\t");
//		}
//		
//		System.out.println();
	}
}
