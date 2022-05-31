
interface RemoteControl {
	public abstract void turnOn();
	public abstract void turnOff();
}

class TV implements RemoteControl {
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켠다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("TV를 끈다.");
	}
}

public class Ex07_09_익명클래스 {
	public static void main(String[] args) {

		TV t1 = new TV();
		t1.turnOn();
		t1.turnOff();
		
		// 굳이 클래스를 만들 필요가 없다.
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("TV를 켠다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("TV를 끈다.");
			}
		}; // 객체생성 끝
		
		rc.turnOn();
		rc.turnOff();
		
	}
}

/*
 * interface
 * 다중상속
 * 미완성 메서드만 있다. 앞에 abstract public void show()
 * final 변수가 있다.
 * 상속받는 클래스에서 implements로 받는다.
 * 객체 생성 불가능
 * 
 * 부모와 같거나 더 넓어야 한다.
 */
