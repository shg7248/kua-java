
class Sports {
	String name;
	int inwon;
	
	Sports() {
		name = "야구";
		inwon = 9;
	}
	
	Sports(String name, int inwon) {
		super();
		this.name = name;
		this.inwon = inwon;
	}
	
	void display(int a) { // 메서드 선언부
		System.out.println("name :" + name);
		System.out.println("inwon : " + inwon);
	}
} //Sports

class BaseBall extends Sports { // class 자식(하위)클래스 extends 부모(조상, 상위)
								// 다중 상속은 불가
								// 부모는 자식이 가지고 있는 것들을 사용할 수 없음

	double ta;
	
	BaseBall(String name, int inwon, double ta) {
//		super() // 기본으로 생성됨
		super(name, inwon); // 부모 생성자 호출
		this.ta = ta;
	}
	
	@Override
	void display(int b) { 	// 메서드 오버라이딩(overriding) 
							// 나에게 해당 메서드가 없으면 부모의 메서드를 사용
		System.out.println("name :" + name);
		System.out.println("inwon : " + inwon);
		System.out.println("ta : " + ta);
	}
	
} // BaseBall

class Football extends Sports {
	
	int goal;

	Football(String name, int inwon, int goal) {
		super(name, inwon);
		this.goal = goal;
	}

	@Override
	void display(int c) {
		System.out.println("name :" + name);
		System.out.println("inwon : " + inwon);
		System.out.println("goal : " + goal);
	}
	
}

public class Ex06_01_상속 {
	public static void main(String[] args) {
		
		Sports s1 = new Sports();	// 야구, 9
		Sports s2 = new Sports("축구", 11);
		
		// display 메서드로 한번에 출력
		s1.display(0);
		System.out.println();
		s2.display(0);
		
		System.out.println();
		
		BaseBall bb = new BaseBall("야구", 5, 0.345);
		bb.display(0);
		
		System.out.println();
		
		Football fb = new Football("축구", 7, 3);
		fb.display(0);
	}
}

/*
 * 		부모 생성자를 호출하는 코드
 * 		아써도 기본으로 들어간다. 생략이 안된다.
 * 		생성자 첫줄에만 존재한다.
 */
