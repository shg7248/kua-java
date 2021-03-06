import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex05_03_메서드 {
	public static void main(String[] args) throws Exception { // main 메서드 정의
		
		show(); // show 메서드 호출
		System.out.println("가나다");
		show();
		System.out.println("라마바");
		show();
		System.out.println("------");
		add(3,4); // 호출 3,4:(전달)인자 or argument
		add(100, 200);
		System.out.println("*****");
		sub(100, 11, 22);
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Desktop\\이미지\\install.png");
		
		int count = 0;
		while((count = fis.read()) != -1) {
			baos.write(count);
		}
		byte[] arr = baos.toByteArray();
		System.out.println(arr.length);
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\admin\\Desktop\\이미지\\install2.png");
		fos.write(arr);
		fos.flush();
		
		// 5, 20을 넘겨서 곱하기 결과를 리턴받아 출력하는 메서드 정의
		int mul = mul(5, 20);
		System.out.println("mul : " + mul);
	}
	
	static void show(String ...s) { // show 메서드 정의
		System.out.println("show 메서드 정의 부분");
		System.out.println("즐거운 자바 공부");
	} // show 메서드 정의 끝
	
	// int x = 3
	// int y = 4
	static void add(int x, int y) { // add 메서드 정의
		System.out.println("두 수의 합 : " + (x + y));
		return; // 호출한 곳으로 돌아가라
	}
	
	static int sub(int x, int y, int z) {
		int result = x - y - z;
		return result;
	}
	
	static int mul(int x, int y) {
		int result = x * y;
		return result;
	}
}

/*
 * 		- 메서드
 * 		특정한 작업을 수행하도록 독립적으로 작성된 프로그램
 * 		메서드 정의 부분이 필요할 때 마다 호출해서 사용할 수 있다.
 * 		메서드 처리가 끝나면 호출한 곳으로 돌아간다.
 * 
 * 		아침기상
 * 		세수
 * 		냉장고에서 반찬꺼내기
 * 		밥솥 밥 담기
 * 		숟가락 놓기
 * 		설겆이
 * 		식탁 닦기
 * 		학원
 * 		공부
 * 		
 */
