
public class Ex08_02_String extends Object {
	public static void main(String[] args) {

		String str1 = "Nice day";
		String str2 = new String("nice day");
		String str3 = "Ha Ha";
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println(str1 == str2); // 주소비교
		
		int len = str1.length();
		System.out.println("len : " + len);
		
		boolean eq = str1.equals(str2);
		System.out.println("eq : " + eq);
		
		System.out.println(str1.equalsIgnoreCase(str2)); // 대소문자 무시하고 비교
		
		int c = str2.compareTo(str1); // 같으면 0, 같지 않으면 0이 아닌 값
		System.out.println("compareTo : " + c);
		
		String str1Upper = str1.toUpperCase();
		System.out.println("str1Upper : " + str1Upper);
		
		System.out.println(str1Upper.toLowerCase());
		
		// 문자열을 연결시켜줌
		System.out.println(str1 + str3);
		System.out.println(str1.concat(str3));
		
		System.out.println(str1.indexOf("day")); // day가 5번째 위치부터 시작한다.
		System.out.println(str1.indexOf("java")); // 찾는 문자열이 없으며 -1을 리턴한다.
		System.out.println(str1.charAt(2)); // 위치의 문자
		System.out.println(str1.substring(2, 7)); // 2번째 부터 7번째 앞까지 선택
		System.out.println(str1.substring(2)); // 2번째 부터 끝까지
		System.out.println(str1.replace("a", "x")); // 모든 a를 x로 바꿔줌
	}
}

/*
 * 
 * Object
 * String toString() : 주소를 리턴
 * boolean equals() : 주소 비교한 결과 리턴
 * 
 * String
 * toString() : 문자열 리턴
 * boolean equals() : 문자열 비교한 결과를 리턴
 * 
 * 
 * 
 * 
 */
