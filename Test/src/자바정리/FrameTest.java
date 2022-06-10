package 자바정리;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class SecondFrame extends JFrame {
	
	JFrame opener;
	
	SecondFrame(String title, JFrame opener) {
		super(title);
		this.opener = opener;
	}
	
	void init() {
		setVisible(true);
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
	
	void start() {
		Container contentPane = getContentPane();
		JButton jb1 = new JButton();
		jb1.setText("뒤로가기");
		contentPane.add(jb1);
		
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				opener.setVisible(true);
			}
		});
	}
}

class NewFrame extends JFrame {
	
	static JFrame opener;
	SecondFrame sf;
	
	private static class InnerInstanceClazz {
		private static final SecondFrame instance = new SecondFrame("두번째", opener);
	}
	
	public static SecondFrame getInstance() {
		return InnerInstanceClazz.instance;
	}
	
	NewFrame(String title) {
		super(title);
		opener = this;
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		JButton jb1 = new JButton();
		jb1.setText("Login");
		contentPane.add(jb1);
		
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(sf == null) {
					sf = NewFrame.getInstance();
				}
				sf.init();
				sf.start();
				setVisible(false);
			}
		});
		
		setVisible(true);
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class FrameTest {
	public static void main(String[] args) {
		new NewFrame("프레임 테스트");
	}
}
