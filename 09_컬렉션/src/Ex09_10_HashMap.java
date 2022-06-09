import java.util.HashMap;
import java.util.Scanner;

public class Ex09_10_HashMap {
	public static void main(String[] args) {
		
		HashMap<String, String> dic = new HashMap<String, String>();
		
		dic.put("pencil", "연필");
		dic.put("sky", "하늘");
		dic.put("desk", "책상");
		dic.put("face", "얼굴");
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.print("찾는 단어는?(q입력시 종료) ");
			String input = sc.next();
			
			if(input.equals("q"))
				break;
			
			String value = dic.get(input);
			
			if(value == null) {
				System.out.println("잘못입력하셨음");
			} 
			else {
				System.out.println("뜻 : " + value);
			}
			System.out.println();
		}
		System.out.println("시스템을 종료합니다.");
	}
}