
class AA implements Runnable {
//	void method() {
//		for(int i = 1; i <= 30; i++) {
//			System.out.print(i + " ");
//		}
//	}

	@Override
	public void run() {
		for(int i = 1; i <= 30; i++) {
			System.out.print(i + " ");
		}		
	}
}

public class Ex10_01_Thread {
	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		
		Thread thread = new Thread(new AA());
		thread.start();				// run 메서드가 호출된다.					
		System.out.println();
		
		System.out.println("프로그램 종료");
	}
}
