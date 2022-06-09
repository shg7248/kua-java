
class DaemonTest extends Thread{
	public void run() {
		while(true) {
			try {
				Thread.sleep(3000);
				System.out.println("Daemon");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if(Ex10_05_데몬스레드.autoSave) {
				autoSave();
			}
		}
	}
	public void autoSave() {
		System.out.println("작업화일이 자동저장되었습니다.");
	}
}//DaemonTest

public class Ex10_05_데몬스레드 {
	
	static boolean autoSave = false;
	
	public static void main(String[] args) {
		DaemonTest t = new DaemonTest();
		t.setDaemon(true); 		// 데몬 스레드로 설정
		t.start();				// 메인 스레드와 같이 돌아감
		
		for(int i=1;i<=20;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
			if(i==5)
				autoSave = true;
		}//for
		System.out.println("프로그램을 종료합니다."); // 메인 스레드가 끝나면 데몬 스레드도 같이 끝남
	}//main
}

/*
	다른 일반 스레드(데몬 스레드가 아닌 스레드)의 작업을 돕는 보조적인 역할을 수행하는 스레드
	일반 스레드가 모두 종료되면 데몬 스레드는 강제적으로 자동 종료된다.
	가비지 컬렉터, 워드프로세서의 자동저장, 화면자동 갱신 등에 쓰인다.
	데몬스레드는 특정조건이 만족되면 작업을 수행하고 다시 대기하도록 작성한다.
	데몬스레드를 생성한 다음 실행하기 전에 setDaemon(true)를 호출하면 된다.
	데몬 스레드가 생성한 스레드는 자동으로 데몬 스레드가 된다.
	boolean isDaemon()
		스레드가 데몬스레드인지 확인하고 데몬스레드이면 true를 반환
	void setDaemon(boolean on)
		스레드를 데몬 스레드로 또는 사용자 스레드로 변경한다.
		매개변수 on을 true로 지정하면 데몬 스레드가 된다.

*/