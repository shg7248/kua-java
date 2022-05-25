
public class Test01_송학관 {
	public static void main(String[] args) {
		
		// 1~100 사이의 수 중 5의 배수이면서 7의 배수인 수 출력
		// 35
		// 70
		
		for(int i = 1; i <= 100; i++) {
			if(i % 5 == 0 && i % 7 == 0)
				System.out.println(i);
		}

		
	}
}
