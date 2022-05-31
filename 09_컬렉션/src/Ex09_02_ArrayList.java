import java.util.ArrayList;
import java.util.Scanner;

public class Ex09_02_ArrayList {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		System.out.println(list.size());
		list.add("수영");
		list.add("효연");
		list.add("써니");
		list.add("수영");
		
		list.add(1, "태연");
		
		System.out.println(list.size()); // 동적인 메모리 확장
		System.out.println(list); //
		
		String g1 = list.get(1);
		System.out.println(g1);
		
		list.set(1, "윤아"); // 수정
		System.out.println(list);
		
		list.remove(2); // 제거
		System.out.println(g1);
		
		int index = list.indexOf("써니");
		System.out.println("index : " + index); // 없으면 -1 리턴
		
		boolean con = list.contains("윤아");
		System.out.println("con : " + con); // true, false
		
		Scanner sc = new Scanner(System.in);

		System.out.print("이름 입력 : ");
		String name = sc.next();
		
		if(list.indexOf(name) != -1) { // indexOf
			System.out.println("가입한 회원입니다.");
		}
		else {
			System.out.println("가입하지 않은 회원입니다.");
		}
		
		if(list.contains(name)) { // contains
			System.out.println("가입한 회원입니다.");
		}
		else {
			System.out.println("가입하지 않은 회원입니다.");
		}
		
		System.out.println("-----------------------------------");
		
		boolean flg = false;
		for(int i = 0; i < list.size(); i++) {
			String g = list.get(i);
			if(g.equals(name)) {
				System.out.println("가입한 회원입니다.");
				flg = !flg;
				break;
			}
		}
		
		if(!flg) {
			System.out.println("가입하지 않은 회원입니다.");
		}
		
		System.out.println("---------------------------------");
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(10); // new Integer(10) autoboxing
		list2.add(20);
		list2.add(30);
		System.out.println(list2.size());
		System.out.println(list2); // [10, 20, 30]
		
		Integer i1 = list2.get(1);
		System.out.println(i1);
	}
}

/*
 * length : 배열의 길이
 * length() : 문자열의 길이
 * size() : 컬렉션 안의 요소의 갯수
 * 
 * ArrayList의 toString은 element(요소)의 toString()을 호출한다.
 * 
 * 
 * 
 * 배열
 * 같은 타입의 데이터를 하나로 묶어서 관리.
 * 위치번호가 0번부터 시작한다.
 * 고정된 크기를 갖는다.
 * 
 * 컬렉션 == 저장공간
 * 여러 데이터를 하나로 묶어서 관리.
 * 동적으로 메모리를 확장할 수 있다.
 * 객체만 저장할 수 있다.
 * 
 * List : 순서(위치번호)가 있는 데이터의 집합. 데이터의 중복을 허용한다.
 * 		ArrayList, Vector
 * Set : 순서를 유지하지 않는 데이터의 집합. 데이터의 중복을 허용하지 않는다.
 * 		HashSet, TreeSet
 * Map : 키(key)와 값(value)
 */
