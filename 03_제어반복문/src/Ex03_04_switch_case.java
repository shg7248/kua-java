public class Ex03_04_switch_case {
	public static void main(String[] args) {
		int n = 1;
		if(n==1) {
			System.out.println("1입니다.");
		}
		else if(n==2) {
			System.out.println("2입니다.");
		}
		else if(n==3) {
			System.out.println("3입니다.");
		}
		else {
			System.out.println("1 ~ 3이 아닙니다.");
		}
		
		System.out.println();
		
		switch(n + 1) {
		case 1 : 
			System.out.println("1입니다.");
			break;
		case 2 : 
			System.out.println("2입니다.");
			break;
		case 3 : 
			System.out.println("3입니다.");
			break;
		default : 
			System.out.println("1 ~ 3이 아닙니다.");
		}
		
		System.out.println("switch ~ case 공부중");
		
		String fruit = "banana";
		switch(fruit) {
		case "apple" :
			System.out.println("사과");
			break;
		case "banana" :
			System.out.println("바나나");
			break;
		default :
			System.out.println("그 밖의 과일");
		}
		
		System.out.println(fruit == "banana");
		
		char ch = 'M';
		switch(ch) {
		case 'm' :	// 조건이 없으면 밑으로 내려감
		case 'M' :
			System.out.println("Morning");
			break;
		case 'a' :
		case 'A' :
			System.out.println("Afternoon");
			break;
		case 'e' :
		case 'E' :
			System.out.println("Evening");
			break;
		default :
			System.out.println("잘못 입력하셨음");
		}
	}
}

/*		실수는 올수 없다
 * 		switch(정수 or 정수형변수 or 문자열){
 * 			case 정수1 : 실행1;
 * 				break;
 * 			case 정수2 : 실행2;
 * 				break;
 * 			case 정수n : 실행n;
 * 				break;
 * 			default : 실행3;
 * 				break;
 * 		}
 * 
 */
