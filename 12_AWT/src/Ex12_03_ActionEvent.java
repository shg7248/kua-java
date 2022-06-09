import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

class Sub2 extends JFrame implements ActionListener {
	
	Button b1, b2, b3, b4;
	
	Sub2(String title) {
		
		super(title);
		setVisible(true);
		setSize(400, 300);
		setLocation(100, 100);
		setLayout(new FlowLayout());
		
		// Button ActionEvent가 발생하면 new ActionEvent() 객체 생성 => actionPerformed()
		// Choice ItemEvent가 발생하면 new ItemEvent() 객체 생성 => itemStateChanged()
		// Frame WindowEvent가 발생하면 new WindowEvent() 객체 생성
		b1 = new Button("노란색");
		b2 = new Button("빨간색");
		b3 = new Button("파란색");
		b4 = new Button("초록색");
		
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);
		
		b1.setBackground(Color.yellow);		// 배경 색상
		b2.setForeground(Color.RED);		// 글자 색상
		b3.setForeground(Color.BLUE);
		b3.setBackground(Color.cyan);
		b4.setBackground(Color.green);
		
		// 이벤트가 발생하면 관련 이벤트의 객체가 생성된다.
		b1.addActionListener(this);			// this : 현재 클래스
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("actionPerformed");
		Object obj = e.getSource();
		System.out.println(obj);
		
		if(obj == b1) {
			getContentPane().setBackground(Color.yellow);
		}
		else if(obj == b2) {
			getContentPane().setBackground(Color.red);
		}
		else if(obj == b3){
			getContentPane().setBackground(Color.blue);
		}
		else {
			getContentPane().setBackground(Color.green);
		}
	}
}

public class Ex12_03_ActionEvent {
	public static void main(String[] args) {
		
		JFrame f = new Sub2("AWT예제");
		
	}
}
// Event Source
// Event Source는 Event가 발생되는 Component를 말한다.
