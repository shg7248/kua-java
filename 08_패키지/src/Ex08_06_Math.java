import java.util.Arrays;
import java.util.HashSet;
import java.util.function.Consumer;

public class Ex08_06_Math extends Object {
	public static void main(String[] args) {
		
		int lotto[] = new int[6];
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45) + 1;
		}
		
		
		while(true) {
			int ii = (int)(Math.random() * 45) + 1;
			if(lotto[lotto.length - 1] != 0)
				break;
			if(Arrays.binarySearch(lotto, ii) == -1) {
				
			}
		}
		
		for(int l : lotto) {
			System.out.print(l+"\t");
		}
		
		System.out.println();
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		while(true) {
			if(set.size() != 6) 
				set.add((int)(Math.random() * 45) + 1);
			else
				break;
		}
		
		set.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.print(t+"\t");
			}		
		});
		
	}
}
