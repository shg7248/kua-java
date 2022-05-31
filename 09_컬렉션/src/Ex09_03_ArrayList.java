import java.util.ArrayList;
import java.util.Scanner;

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
	
	@Override
	public String toString() {
		return this.id + ":" + this.pw;
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
		System.out.println(list);
		System.out.println("-----");
		
		for(Person p : list) {
			System.out.println("id : " + p.getId());
			System.out.println("pw : " + p.getPw());
			System.out.println();
		}
		System.out.println("-----");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("id 입력 : ");
		String id = sc.next();
		
		boolean find = false;
		for(Person p : list) {
			if(p.getId().equals(id)) {
				System.out.println("비밀번호는 " + p.getPw() + "입니다.");
				find = !find;
				break;
			}
		}
		if(!find) {
			System.out.println("없는 아이디 입니다.");
		}
	}
}
