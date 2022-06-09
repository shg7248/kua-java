
class Data2 {
	int i = 0; // 공유 자원
}

class AAA2 extends Thread {
	
	@Override
	public void run() {
		for(int i = 0; i < 100000; i++) {
			synchronized (Data2.class) {
				Ex10_07_SyncTest.d1.i++; // 임계 영역
			}
		}
		System.out.println(Ex10_07_SyncTest.d1.i);
	}
}

class BBB2 extends Thread {
	
	@Override
	public void run() {
		for(int i = 0; i < 100000; i++) {
			synchronized (Data2.class) {
				Ex10_07_SyncTest.d1.i++; // 임계 영역
			}
		}
		System.out.println(Ex10_07_SyncTest.d1.i);
	}
}

public class Ex10_07_SyncTest {
	
	static Data2 d1 = new Data2();
	
	public static void main(String[] args) {
		System.out.println("main 시작");
		
		Thread t1 = new AAA2();
		t1.start();
		
		Thread t2 = new BBB2();
		t2.start();
		
		System.out.println("main 종료");
	}
}

/*
	동기화 (Synchronization)
	임계 영역?
		멀티스레드에 의해 공유자원이 참조될 수 있는 코드의 범위
	스레드들이 임계영역에서 여러 개 동시에 작업을 진행하기 때문에 공유자원의 문제가 발생한다.
	순서대로 공유자원을 사용하게끔 하는 기법을 동기화라고 한다.
	동기화 : 사건이 동시에 일어나거나, 일정한 간격을 두고 일어나도록 시간의 간격을 조정하는 것을 이른다.


*/