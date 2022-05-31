
public class Ex07_04_예외처리 {
	public static void main(String[] args) {
		
		try {
			sub();
		}catch(Exception ae) {
			System.out.println(ae.getMessage());
			System.out.println(ae.toString());
		}
		
	}

	static void sub() throws Exception {
		int result = 10/0;				// ArithmeticException
		System.out.println(result);
	}
}