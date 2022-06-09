
class Horizontal extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print("-");
			if(i % 50 == 0)
				System.out.println();
		}
	}
}

class Vertical extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print("|");
			if(i % 50 == 0)
				System.out.println();
		}
	}
}

public class Ex10_04_Thread {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		Thread t1 = new Horizontal();
		Thread t2 = new Vertical();
		
		t1.start();
		t2.start();
		
		System.out.println("t1의 priority : " + t1.getPriority());
		System.out.println("t2의 priority : " + t2.getPriority());
		t2.setPriority(7); // 숫자가 클수록 우선순위가 높다
		System.out.println("t2의 priority : " + t2.getPriority());
		
		System.out.println("프로그램 종료");
	}
}

// 멀티스레드의 장점
// CPU 사용률을 향상시킨다.
// 자원을 보다 효율적으로 사용할 수 있다.
// 사용자에 대한 응답성이 향상된다.
// 작업이 분리되어 코드가 간결해진다.
