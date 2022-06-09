import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class Ex09_07_HashSet {
	public static void main(String[] args) {
		
		Set<String> hs = new HashSet<String>();
		System.out.println(hs.size());
		
		hs.add("banana");
		hs.add("orange");
		hs.add("banana");
		hs.add("melon");
		System.out.println(hs.size());
//		System.out.println(hs.get(0));
		
		System.out.println(hs);
		
		for(String s : hs) {
			System.out.print(s + " ");
		}
		
		System.out.println();
		
		Iterator<String> iterator = hs.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		
		System.out.println();
		
		hs.remove("orange");
		
		System.out.println(hs);
		
		System.out.println(hs.contains("banana"));
		
		hs.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.print(t + " ");
			}
			
		});
	}
}

// set : 순서가 없다. 중복 허용 안한다.