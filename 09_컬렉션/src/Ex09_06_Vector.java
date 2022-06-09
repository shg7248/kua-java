import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Ex09_06_Vector {
	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();
		System.out.println(v.size());
		v.add("봄");
		v.add("여름");
		v.add("봄");
		v.add("겨울");
		
		System.out.println(v.size());
		System.out.println(v);
		
		for(int i = 0; i < v.size(); i++) {
			System.out.print(v.get(i) + " ");
		}
		
		System.out.println();
		
		for(String str : v) {
			System.out.print(str + " ");
		}
		
		System.out.println();
		
		Enumeration<String> en = v.elements(); // Vector에서만 사용이 가능하다.
		
		while(en.hasMoreElements()) {
			String t = en.nextElement();
			System.out.print(t + " ");
		}
		
		System.out.println();
		
		Iterator<String>it = v.iterator();
		while(it.hasNext()) {
			String j = it.next();
			System.out.print(j + " ");
		}
	}
}

// Vector는 자체적으로 동기화처리가 되어 있으나 ArrayList는 그렇지 않다.
