
public class Ex07_01 {
	public static void main(String[] args) {
		
		try {
			String str = null; // new String("orange")
			System.out.println(str);
			System.out.println(str.length()); // NullPointerException
			System.out.println("예외처리");
			
//			NullPointerException e = new NullPointerException();
		} catch(NullPointerException npe) {		// 에러가 발생할 경우 넘어옴
			System.out.println("에러 발생");
		} finally {	// 무조건 넘어옴
			System.out.println("finally 부분");
		}
		
	} // main
} // class


// 발생하면 갑자기
//catch
//finally

// 컴파일 에러 : 컴파일할 때 발생하는 에러 (오타, 자료형 체크...)
// 런타임 에러 : 실행할 때 발생하는 에러 (배열의 범위를 넘기는 경우...)

// 런타임 에러는 에러와 예외 두 가지로 구분한다.
// 에러(Error) 		: 프로그램 코드에 의해서 수습될 수 없는 심각한 오류
// 예외(Exception) 	: 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류