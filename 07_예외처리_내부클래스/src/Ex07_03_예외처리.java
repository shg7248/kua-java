
public class Ex07_03_예외처리 {
	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30};
		
		try {
			System.out.println(arr[1]);
			System.out.println(arr[3]);
			
			int result = 3/0;
			
			String str = null;
			System.out.println(str.length()); // 첫번째 예외만 처리하고 끝나기 때문에 또 다른 예외가 발생하지 않음
			
		} catch(ArrayIndexOutOfBoundsException aioobe) {
			System.out.println("없는 방이예요!!");
			System.out.println(aioobe.getMessage());
			System.out.println(aioobe.toString());
		} catch(NullPointerException ne) {
			System.out.println("null로 초기화한 변수의 길이는 못구함");
			System.out.println(ne.getMessage());
			System.out.println(ne.toString());			
		} catch(ArithmeticException ae) {
			System.out.println("0으로 나누면 안되요!");
			System.out.println(ae.getMessage());
			System.out.println(ae.toString());					
		} catch(Exception e) {	// 모든 에러를 다 잡아주고 싶을 경우 Exception의 조상을 사용
			System.out.println(e.getMessage());
		} finally {
			// 에러 발생 유무에 관계없이 실행
			System.out.println("finally 부분");
		}
		
	}
}