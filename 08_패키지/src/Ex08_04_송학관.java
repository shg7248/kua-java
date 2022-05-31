import java.util.Scanner;

class Person {
	String id;
	String pw;
	String name;

	Person(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
}

public class Ex08_04_송학관 extends Object {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Person[] p = { 	new Person("kim", "1234", "김연아"),
				new Person("son", "7777", "손흥민"),
				new Person("jang", "9876", "장미란")};

		while(true) {
			String id = null;
			boolean find = false;
			
			try {
				System.out.print("id입력 : ");
				id = sc.nextLine();
				if(id.length() < 3 || id.length() > 8) 
					throw new Exception();

			} catch(Exception e) {
				System.out.println("id는 3글자~8글자 입력해야 합니다.");
				continue;
			}

			System.out.print("pw입력 : ");
			String pw = sc.nextLine();

			for(Person person : p) {
				if(person.id.equals(id)) {
					if(person.pw.equals(pw)) {
						System.out.println(person.name + "님 반갑습니다.");
						find = !find;
						break;
					} else {
						System.out.println("비번이 맞지 않습니다.");
						find = !find;
						break;
					}
				}
			}
			if(!find) {
				System.out.println("해당 아이디가 없습니다.");
			}
			
			System.out.print("계속? ");
			if (sc.nextLine().equals("y")) {
				continue;
			} else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		}

	}
}
