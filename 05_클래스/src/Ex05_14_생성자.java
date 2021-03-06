
class Member {
	
	private String id;
	private String passwd;
	
	Member() { // 생성자 정의
		System.out.println("Member 생성자");
		id = "park";
		passwd = "3456";	
	}
	
	Member(String id, String passwd) {		// 생성자 오버로딩
		System.out.println("String id, String passwd");
		this.id = id;
		this.passwd = passwd;
	}
	
	void setId(String id) {		// 정의
		this.id = id;
	}
	
	String getId() {
		return this.id;
	}
	
	void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	String getPasswd() {
		return this.passwd;
	}
}

public class Ex05_14_생성자 {
	public static void main(String[] args) {

		Member m1 = new Member();
		m1.setId("kim");
		m1.setPasswd("1234");
		
		System.out.println("id : " + m1.getId());
		System.out.println("passwd : " + m1.getPasswd());
	
		System.out.println("========================");
		
		Member m2 = new Member("chio", "7777");
		System.out.println("id : " + m2.getId());
		System.out.println("passwd : " + m2.getPasswd());
	}
}
/*
	생성자는 메서드다.
	클래스와 이름이 똑같은 메서드
	리턴값이 없다. void도 쓰지 않는다.
	객체를 만들면 자동으로 호출된다.
	생성자를 정의하지 않으면 기본생성자(default 생성자)가 하나 자동으로 생성된다.
*/