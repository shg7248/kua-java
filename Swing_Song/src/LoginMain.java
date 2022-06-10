import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class LoginScreen extends JFrame {
	
	private static final int FRAME_WIDTH = 400;
	private static final int FRAME_HEIGHT = 250;
	
	private static final int PANEL1_WIDTH = 250;
	private static final int PANEL1_HEIGHT = 250;
	
	private static final int PANEL2_WIDTH = 150;
	private static final int PANEL2_HEIGHT = 250;
	
	private final String[] TITLE_NAME = {"회원아이디", "회원비밀번호"};
	
	LoginScreen(String title) {
		draw();
		init();
	}
	
	void init() {
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
		this.setResizable(false);
	}
	
	void draw() {
		Container contentPane = this.getContentPane();
		
		JPanel west = new JPanel();
		west.setBackground(Color.RED);
		west.setPreferredSize(new Dimension(PANEL1_WIDTH, FRAME_HEIGHT - 30));
		
		JPanel south = new JPanel();
		south.setPreferredSize(new Dimension(200,30));
		south.setLayout(new GridLayout(1, 1));
		JButton joinBtn = new JButton("회원가입");
		JButton exitBtn = new JButton("종료");
		south.add(joinBtn);
		south.add(exitBtn);
		
		JPanel east = new JPanel();
		east.setPreferredSize(new Dimension(PANEL2_WIDTH, PANEL2_HEIGHT));
		east.setBackground(Color.YELLOW);
		
		contentPane.add(west, BorderLayout.WEST);
		contentPane.add(south, BorderLayout.SOUTH);
		contentPane.add(east, BorderLayout.EAST);
	}
	
}

public class LoginMain {
	public static void main(String[] args) {
		new LoginScreen("퀴즈 게임 로그인");
	}
}
