
public class Ex05_06_배열넘기기 {
	public static void main(String[] args) throws Exception { // 정의
		
		int[] arr = new int[] {1, 2, 3};
		sub();
		
		Ex05_06_배열넘기기 e = new Ex05_06_배열넘기기();
		e.sub2(arr[0], arr[1], arr[2]);
		e.sub3(arr);
		
		System.out.println("----");
		
		int i;
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	static void sub() {
		System.out.println("sub 메서드");
		// return;
	}
	
	void sub2(int i, int j, int k) {
		System.out.println("sub2 메서드");
		System.out.println(i+", "+j+", "+k);
	}
	
	void sub3(int[] arr) { // int[] arr = {1, 2, 3}
		System.out.println("sub3 메서드");
		for(int x : arr) {
			System.out.print(x + " ");
		}
		
		System.out.println();
		
		arr[1] = 100;
		int i;
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		// return;
	}
}