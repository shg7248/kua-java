import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;

public class Ex12_01_Frame {
	public static void main(String[] args) {
			
		Frame f = new Frame();
		f.setVisible(true);			// 보이게
		f.setSize(400, 300);		// 사이즈
		f.setLocation(300, 100);	// 시작위치
		
		Label l1 = new Label("fsdfdsdsffds");
		l1.setBackground(Color.BLUE);
		
		f.add(l1);
	}
}

// GUI : 명령어 위주가 아닌 ICON을 통한 대화방식
// 컨테이너 -> 컴포넌트