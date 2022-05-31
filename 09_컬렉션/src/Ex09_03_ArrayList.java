import java.util.ArrayList;

class Person {
	
	private String id;
	private String pw;
	
	public Person(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return this.id;
	}
	
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public String getPw() {
		return this.pw;
	}
	
}

public class Ex09_03_ArrayList {
	public static void main(String[] args) {
		
		ArrayList<Person> list = new ArrayList<Person>();
		
		Person p1 = new Person("kim", "1234");
		Person p2 = new Person("park", "7777");
		Person p3 = new Person("choi", "9876");
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		System.out.println(list.size());
		
	}
}
