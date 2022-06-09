
class Big implements Runnable {
	
	@Override
	public void run() {
		for(int i = 65; i <= 90; i++) {
			System.out.print((char)i + " ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Small extends Thread {

	@Override
	public void run() {
		for(char i = 'a'; i <= 'z'; i++) {
			System.out.print(i + " ");
			try {
				sleep(1500); // Thread를 직접 상속받았기 때문에 Thread를 쓰지 않아도 된다.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Ex10_03_Thread {
	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		Thread t1 = new Thread(new Big());
		t1.start();
		
		Thread t2 = new Small();
		t2.start();
		System.out.println("프로그램 종료");
	}
}
