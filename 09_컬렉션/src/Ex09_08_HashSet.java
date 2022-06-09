import java.util.HashSet;

public class Ex09_08_HashSet {
	public static void main(String[] args) {
		
		int[] arr = new int[6];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
		}
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		HashSet<Integer> hs = new HashSet<Integer>();

		int count = 0;
		while(hs.size() < 7) {
			int random = (int)(Math.random() * 45) + 1;
			hs.add(random);
			count++;
		}
		
		System.out.println(hs);
		System.out.println("count : " + count);
		
	}
}