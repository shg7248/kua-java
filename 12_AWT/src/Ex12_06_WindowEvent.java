import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class Sub6 extends Frame implements WindowListener{
	
	Sub6(String title) {
		super(title);
		setVisible(true);
		setSize(300, 200);
		
		addWindowListener(this);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("창이닫힘");
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("창이 최소화됨");
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("창이 활성화됨");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		
	}
}

public class Ex12_06_WindowEvent {
	public static void main(String[] args) {
		
		Sub6 sub = new Sub6("WindowEvent 예제");
	}
}
