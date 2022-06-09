import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Sub7 extends Frame {
	
	Sub7(String title){
		super(title);
		setSize(300, 200);
		setVisible(true);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("창이 닫힘");
				System.exit(0);
			}
			@Override
			public void windowActivated(WindowEvent e) {
				System.out.println("창이 활성화됨");
			}
		});
	}
	
}

public class Ex12_07_WindowAdapter {
	public static void main(String[] args) {
		
		new Sub7("WindowAdapter 예제");
		
	}
}
