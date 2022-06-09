import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Sub8 extends JFrame {
	
	
	
	Sub8(String title) {
		super(title);
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		p1.setBackground(Color.yellow);
		p2.setBackground(Color.cyan);
		
		Container contentPane = getContentPane();
		contentPane.add(p1, BorderLayout.CENTER);
		contentPane.add(p2, BorderLayout.SOUTH);
		
		JTextField text1 = new JTextField(5);
		JTextField text2 = new JTextField(5);
		JTextField text3 = new JTextField(5);
		p1.add(text1);
		p1.add(new JLabel("+"));
		p1.add(text2);
		p1.add(new JLabel("="));
		p1.add(text3);
		
		JButton b1 = new JButton();
		b1.setText("확인");
		JButton b2 = new JButton();
		b2.setText("취소");
		
		p2.add(b1);
		p2.add(b2);
		
		b1.addActionListener(new OKButton(text1, text2, text3));
		b2.addActionListener(new CancelButton(text1, text2, text3));
		
		setVisible(true);
		pack(); // 딱 맞는 크기를 설정하고 싶을 경우
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	} // 생성자
	
	class OKButton implements ActionListener {

		JTextField t1, t2, t3;
		
		OKButton(JTextField t1, JTextField t2, JTextField t3) {
			this.t1 = t1;
			this.t2 = t2;
			this.t3 = t3;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
//			System.out.println("확인 클릭함");
			try {
				int i1 = Integer.parseInt(t1.getText());
				int i2 = Integer.parseInt(t2.getText());
				int sum = i1 + i2;
				t3.setText(String.valueOf(sum));
			}catch(NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, "숫자만 입력 가능");
			}
		}
	} // OKButton
	
	class CancelButton implements ActionListener {

		JTextField t1, t2, t3;
		
		CancelButton(JTextField t1, JTextField t2, JTextField t3) {
			this.t1 = t1;
			this.t2 = t2;
			this.t3 = t3;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
//			System.out.println("취소 클릭함");
			t1.setText("");
			t2.setText("");
			t3.setText("");
		}
	} // CancelButton
}

public class Ex12_08_Add {
	public static void main(String[] args) {
		
		new Sub8("덧셈 프로그램");
		
	}
}
