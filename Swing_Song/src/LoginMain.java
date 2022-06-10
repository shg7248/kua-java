import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class LoginScreen extends JFrame {
	
	private static final int FRAME_WIDTH = 400;
	private static final int FRAME_HEIGHT = 150;
	
	private static final int PANEL1_WIDTH = 250;
	
	private static final int PANEL2_WIDTH = 150;
	private static final int IDPW_WIDTH = 240;
	private static final int IDPW_HEIGHT = 50;
	
	private static final int PANEL3_HEIGHT = 30;
	
	private final String[] TITLE_NAME = {"회원아이디", "회원비밀번호"};
	
	LoginScreen(String title) {
		super(title);
		draw();
		init();
	}
	
	void init() {
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(new Dimension(FRAME_WIDTH + 15, FRAME_HEIGHT + 38));
		this.setResizable(false);
	}
	
	void draw() {
		Container contentPane = this.getContentPane();
		
		//////////////////////////////////////////////////////////
		JPanel west = new JPanel();
		west.setLayout(null);
//		west.setBackground(Color.RED);
		west.setPreferredSize(new Dimension(PANEL1_WIDTH, FRAME_HEIGHT - 30));
		JPanel idpw = new JPanel();
//		idpw.setBackground(Color.CYAN);
		idpw.setLayout(new GridBagLayout());
		
		int position_x = (PANEL1_WIDTH / 2) - (IDPW_WIDTH / 2);
		int position_y = ((FRAME_HEIGHT - PANEL3_HEIGHT) / 2) - (IDPW_HEIGHT / 2);
		idpw.setBounds(position_x, position_y, IDPW_WIDTH, IDPW_HEIGHT);
		
		JLabel label1 = new JLabel("회원아이디 ");
		JLabel label2 = new JLabel("회원비밀번호 ");
		JTextField field1 = new JTextField(12);
		JTextField field2 = new JTextField(12);
		
		GridBagConstraints l1 = new GridBagConstraints();
		l1.fill = GridBagConstraints.BOTH;
		l1.gridx = 0;
		l1.gridy = 0;
		l1.gridwidth = 1;
		l1.gridheight = 1;
		
		GridBagConstraints l2 = new GridBagConstraints();
		l2.fill = GridBagConstraints.BOTH;
		l2.gridx = 1;
		l2.gridy = 0;
		l2.gridwidth = 2;
		l2.gridheight = 1;	
		
		GridBagConstraints l3 = new GridBagConstraints();
		l3.fill = GridBagConstraints.BOTH;
		l3.gridx = 0;
		l3.gridy = 1;
		l3.gridwidth = 1;
		l3.gridheight = 1;	
		
		GridBagConstraints l4 = new GridBagConstraints();
		l4.fill = GridBagConstraints.BOTH;
		l4.gridx = 1;
		l4.gridy = 1;
		l4.gridwidth = 2;
		l4.gridheight = 1;	
		
		idpw.add(label1, l1);
		idpw.add(field1, l2);
		idpw.add(label2, l3);
		idpw.add(field2, l4);
		
		for(int i = 0; i < TITLE_NAME.length; i++) {
//			JLabel label = new JLabel(TITLE_NAME[i]);
//			JTextField field = new JTextField(10);
//			
//			GridBagConstraints gbt1 = new GridBagConstraints();
//			gbt1.gridx = 0;
//			gbt1.gridy = 1;
//			idpw.add(label, gbt1);
			
		}
		
		west.add(idpw);
		
		//////////////////////////////////////////////////////////
		
		JPanel south = new JPanel();
		south.setPreferredSize(new Dimension(200,PANEL3_HEIGHT));
		south.setLayout(new GridLayout(1, 1));
		JButton joinBtn = new JButton("회원가입");
		JButton exitBtn = new JButton("종료");
		south.add(joinBtn);
		south.add(exitBtn);
		
		//////////////////////////////////////////////////////////
		
		JPanel east = new JPanel();
		east.setPreferredSize(new Dimension(PANEL2_WIDTH, FRAME_HEIGHT));
		east.setBackground(Color.YELLOW);
		
		//////////////////////////////////////////////////////////
		
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
