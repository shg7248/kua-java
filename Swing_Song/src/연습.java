import java.awt.Button;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;

class 서브 extends JFrame {
	
	GridBagConstraints gbc;
	
	서브(String title) {
		super(title);

		setLayout(new GridBagLayout());
		gbc = new GridBagConstraints();
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		
		layout(new Button("1번째"), 0, 0, 1, 1);
		gbc.fill = GridBagConstraints.BOTH;
		layout(new Button("2번째"), 0, 1, 1, 1);
		layout(new Button("3번째"), 1, 0, 2, 1);
		layout(new Button("4번째"), 1, 1, 1, 1);
		layout(new Button("6번째"), 2, 1, 1, 1);
		

		
		setVisible(true);
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void layout(Component obj, int x, int y, int width ,int height) {
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = width;
		gbc.gridheight = height;
		add(obj, gbc);
	}
}

public class 연습 {
	public static void main(String[] args) {
		new 서브("GridBagLayout");
	}
}
