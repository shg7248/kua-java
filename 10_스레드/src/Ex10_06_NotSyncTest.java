
class Data1 {
	int i = 0;
}

class AAA extends Thread {
	
	@Override
	public void run() {
		for(int i = 0; i < 100000; i++) {
			Ex10_06_NotSyncTest.d1.i++;
		}
		System.out.println(Ex10_06_NotSyncTest.d1.i);
	}
}

class BBB extends Thread {
	
	@Override
	public void run() {
		for(int i = 0; i < 100000; i++) {
			Ex10_06_NotSyncTest.d1.i++;
		}
		System.out.println(Ex10_06_NotSyncTest.d1.i);
	}
}

public class Ex10_06_NotSyncTest {
	
	static Data1 d1 = new Data1();
	
	public static void main(String[] args) {
		System.out.println("main 시작");
		
		Thread t1 = new AAA();
		t1.start();
		
		Thread t2 = new BBB();
		t2.start();
		
		System.out.println("main 종료");
	}
}