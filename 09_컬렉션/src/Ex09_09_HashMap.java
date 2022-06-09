import java.util.HashMap;
import java.util.Set;
import java.util.function.Consumer;

public class Ex09_09_HashMap {
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>(); // key, value
		System.out.println(map.size());
		map.put("슬기", 30);
		map.put("조이", 25);
		map.put("웬디", 12);
		map.put("웬디", 30);		// 마지막에 쓴 값으로 나온다.
		map.put("아이린", 25);
		
		System.out.println(map.size());
		System.out.println(map);
		
		System.out.println(map.get("조이"));
		System.out.println(map.get("아이유"));	// null
		System.out.println(map.get(30));		// key 값만 가능하다!!
		
		System.out.println(map.containsKey("웬디"));		// true
		System.out.println(map.containsKey("이수현"));	// false
		
		System.out.println(map.containsValue(25));		// true
		System.out.println(map.containsValue(12));		// false (제거되어 사라졌음)
		
		Set<String> s = map.keySet();					// key에 해당하는 값들만 가져와서 Set에 저장하겠다
		
		System.out.println();
		
		s.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t + " : " + map.get(t));
			}
		});
		
		map.remove("아이린");
		System.out.println(map);
		
	}
}

/*
	Map
		순서(위치 번호)가 없다.
		키는 중복허용X, 값은 종복허용O
		
	HashMap의 toString()의 기능 : 요소의 toString 호출
*/