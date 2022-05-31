import java.util.Scanner;

class Person2 {
	String id;
	String pw;
	String name;

	Person2(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
}

public class Ex08_04_송학관2 extends Object {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Person2[] p = { 	new Person2("kim", "1234", "김연아"),
				new Person2("son", "7777", "손흥민"),
				new Person2("jang", "9876", "장미란")};

		
		String id, pw, name, retry;
		int i;
		
		do {
		
			boolean flag = false;
			
			System.out.print("id입력 : ");
			id = sc.next();
			if(id.length() < 3 || id.length() > 8) { // 3 ~ 8
				System.out.println("id는 3글자~8글자 입력해야 합니다.");
				continue;
			}
			System.out.print("pw입력 : ");
			pw = sc.next();
			for(i = 0; i < p.length; i++) {
				if(p[i].id.equals(id)) {
					if(p[i].pw.equals(pw)) {
						System.out.println(p[i].name + "님 반갑습니다.");
						flag = true;
						break;
					}
					else {
						System.out.println("비번이 맞지 않습니다.");
						flag = true;
					}
				}
//				else { // id가 일치하지 않으면
//					System.out.println("해당 아이디가 없습니다.");
//				}
			} // for
			
			if(flag == false) {
				System.out.println("해당 아이디가 없습니다.");
			}
			
			System.out.print("계속? : ");
			retry = sc.next();
			if(retry.equals("n")) {
				break; // while문을 빠져나갈때
			}
		} while(true);
		System.out.println("프로그램을 종료합니다.");
	}
}
