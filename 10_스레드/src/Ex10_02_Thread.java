
class BB extends Thread {
	
	@Override
	public void run() {				// 메소드 명은 무조건 run이라고 해야 함
		for(int i = 1; i <= 30; i++) {
			System.out.print(i + " ");
		}		
	}
}

public class Ex10_02_Thread {
	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		
		Thread thread = new BB();
		thread.start();
		System.out.println();
		
		System.out.println("프로그램 종료");
	}
}
