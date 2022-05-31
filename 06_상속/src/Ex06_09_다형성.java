
class Robot {
	// 다형성이 없었으면 똑같은 메서드를 3개 만들뻔 했다.
} // Robot

class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
} // DanceRobot

class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다.");
	}
} // SingRobot

class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
} // DrawRobot

public class Ex06_09_다형성 {
	
	public static void action(Robot r) {
		
//		자동으로 업캐스팅이 됨
//		주소가 넘어옴
//		Robot r = new DanceRobot()		r: 100번지
//		Robot r = new SingRobot()		r: 200번지
//		Robot r = new DrawRobot()		r: 300번지
		
//		타입변경이 확인이 되야 호출이 가능하다.
//		r.dance()
		
		if(r instanceof DanceRobot) {		
//			자식타입으로 변경 할 경우 다운캐스팅을 하는데, 업캐스팅과 달리 자식타입을 명시해 줘야 한다.
			DanceRobot dr = (DanceRobot)r;		// dr: 100번지
			dr.dance();
		} else if(r instanceof SingRobot) {
			SingRobot sr = (SingRobot)r ;		// dr: 200번지
			sr.sing();
		} else if(r instanceof DrawRobot) {
			DrawRobot dr = (DrawRobot)r ;		// dr: 300번지
			dr.draw();
		}
		return;
	} // action

	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), 
						new SingRobot(), 
						new DrawRobot() };
		
//		Robot 클래스에 해당 메서드가 존재하지 않기 때문에 호출을 할 수 없다.
//		arr[0].dance(); 
//		arr[1].sing();
//		arr[2].draw();
		
		for(int i=0; i< arr.length; i++)
			action(arr[i]);
			
	} // main
}
