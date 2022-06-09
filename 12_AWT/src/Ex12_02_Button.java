import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

// 프레임 객체를 만들어도 된다.
class Sub1 extends Frame {
	Sub1(String title) {
		super(title);
		this.setSize(400, 300);
		
		Button east = new Button("동쪽");
		Button west = new Button("서쪽");
		Button south = new Button("남쪽");
		Button north = new Button("북쪽");
		Button center = new Button("중앙");
		
//		setLayout(new FlowLayout());
//		setLayout(new GridLayout(5,1));
		
		// 기본 배치자
		setLayout(new BorderLayout());
		
//		super.add("East", east);
//		this.add("West", west);
//		add("South", south);
//		add("North", north);
//		add("Center", center);
		
		add(east, BorderLayout.EAST);
		add(west, BorderLayout.WEST);
		add(south, BorderLayout.SOUTH);
		add(north, BorderLayout.NORTH);
		add(center, BorderLayout.CENTER);
	}
} // Sub1

public class Ex12_02_Button {
	public static void main(String[] args) {
			
		Frame f = new Sub1("버튼만들기");
		f.setVisible(true);
		
	}
}