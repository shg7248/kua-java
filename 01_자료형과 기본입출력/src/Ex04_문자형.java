
public class Ex04_문자형 {
	public static void main(String[] args) {
		
		char ch;
		ch = 'A'; // char은 작은 따옴표만 넣을 수 있다.
		// ch = 65 // 결과는 같음
		
		System.out.println("ch:"+ch);
		System.out.println(ch + 1); // 66
		// 'A' + 1 = 88
		// 2byte(4byte) + 4byte (char이 int형으로 변환됨)
		
		System.out.println((char)(ch+1)); // A
		
		// 논리형 자료형
		boolean b1;
		b1 = false;
		System.out.println("b1:"+b1);
		
		b1 = 5>3;
		System.out.println("5>3:"+b1);
		
		char[] ch2 = {'A', 'p', 'p', 'l', 'e'};
		String str = new String(ch2);
		System.out.println(str);
		
	}
}

/*
 * 		문자형 자료형
 * 		char : 2byte 0 ~ 65,535
 * 
 * 		아스키코드값
 * A : 65
 * B : 66
 * C : 67
 * 
 * a : 97
 * b : 98
 * 
 * 논리형 자료형
 * boolean 1bit
 */