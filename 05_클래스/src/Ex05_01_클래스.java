
class Person {
	String name;	// 멤버변수, instance변수
	int age;
	double height;	
	static String nation;	// 여러 객체가 서로 공유하고 싶을 때, static 변수, 클래스 변수
	
	Person() { // Person 생성자 정의
		System.out.println("Person 생성자");
	}
}

class Sttu {
	
	Person p;
	
	Sttu() {
		p.name = "Song";
		System.out.println("이이름 : " + p.name);
	}
}

public class Ex05_01_클래스 {
	
	Sttu sttu;
	
	public static void main(String[] args) {
		
//		String name="아이유";
//		int a = 10;
//		double b = 12.34;
//		char c = 'X';
		
		Person p1 = new Person();	// p1은 참조변수 .. 저장공간은 어딘가에 따로 만들어지고 참조변수에 그 저장공간의 주소가 저장됨
									// 객체(instance)를 만든다 = 저장 공간을 만든다
		p1.name = "윤아";				// 참조변수.멤버변수
		p1.age = 30;
		p1.height = 159.7;
		
		Person.nation = "대한민국";
		
		Person p2 = new Person();
		
		p2.name = "학관";
		p2.age = 33;
		p2.height = 173.9;
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.height);
		
		System.out.println();
		
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.height);
		
		System.out.println(Person.nation); // 클래스 이름으로 static 변수에 접근

	}
}

/*
 * 		클래스 : 사용자 정의 자료형 (사용자가 만들어 쓰는 자료형)
 * 		객체 == 인스턴스(instance)
 * 		
 * 		기본 데이터 타입으로 변수를 생성하면
 * 		생성된 변수에는 하나의 데이터만 보관할 수 있고
 * 		정해진 데이터 타입만 사용할 수 있다.
 * 
 * 		하지만 클래스는 동시에 여러 개의 데이터를 담을 수 있는 데이터 타입을
 * 		사용자가 직접 만들어 사용할 수 있다.
 * 
 * 		객체를 만든다는 것은 실체를 만든다는 것이다.
 */
