import java.util.Scanner;

public class Ex08_03_String extends Object {
	public static void main(String[] args) {

		String s = "    abc    DE   Fg    ";
		
		System.out.println("s : " + s);
		System.out.println(s.length());
		System.out.println(s.trim()); // 문자열 양옆에 공백 제거
		String s2 = s.trim();
		System.out.println(s2.length());
		System.out.println(s.contains("DE")); // 포함하고 있냐?
		System.out.println(s.contains("de"));
		System.out.println(s.indexOf("DE"));
		
		if(s.contains("DE") == false) {
			System.out.println("포함하고 있지 않음");
		}
		else {
			System.out.println("포함하고 있음");
		}
		
		if(s.indexOf("de") == -1) {
			System.out.println("포함하고 있지 않음");
		}
		else {
			System.out.println("포함하고 있음");
		}
		
//		indexOF('.') .의 아스키코드를 넣음
		
		String fullName = "Hello.java";
		String fileName;
		String ext;
		
		int index = fullName.indexOf(".");
		fileName = fullName.substring(0, index);
		ext = fullName.substring(index + 1);
		
		System.out.println("fileName : " + fileName);
		System.out.println("ext : " + ext);
		
		String id = "kim";
		String pw = "1234";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력 : ");
		String loginId = sc.nextLine();
		System.out.print("비번 입력 : ");
		String loginPw = sc.nextLine();
		
//		if(loginId.equals(id) && loginPw.equals(pw)) {
		if(loginId.compareTo(id) == 0 && loginPw.compareTo(pw) == 0) {
			System.out.println("로그인 가능");
		} else {
			System.out.println("로그인 불가능");
		}
	}
}
