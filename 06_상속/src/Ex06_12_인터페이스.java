
interface CopyMachine {
	
	// 인터페이스 안에는 미완성된(추상) 메서드만 들어갈 수 있다.
	// abtract가 없으면 자동으로 붙는다.
	
	
	int a = 10; 	// final이 자동으로 붙음
	
	void copy(); 	// public이 자동으로 붙음
	
} // Copymachine

interface PrintMachine {
	
	abstract void print();
	
}

interface FaxMachine {
	
	void fax();
	
}

//	인터페이스를 상속받을 시 implements를 사용한다.
class Compound implements CopyMachine, PrintMachine, FaxMachine {
	
	public void copy() {
		System.out.println("복사한다.");
	}
	
	public void print() {
		System.out.println("출력한다.");
	}
	
	public void fax() {
		System.out.println("팩스로 보낸다.");
	}
}

class Compound2 implements FaxMachine, PrintMachine {

	public void print() {
		System.out.println("출력한다.");
	}

	public void fax() {
		System.out.println("팩스로 보낸다.");
	}
	
}

public class Ex06_12_인터페이스 {
	public static void main(String[] args) {
		
//		인터페이스는 객체를 생성할 수 없다
//		CopyMachine c = new CopyMachine();
		
		Compound com = new Compound();
		com.copy();
		com.print();
		com.fax();
		System.out.println(com.a);
//		com.a = 20; // final이기 때문에 값을 수정하지 못한다.
//		System.out.println(com.a);
		
	} // main
}
