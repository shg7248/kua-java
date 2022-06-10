import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Ex12_09_JTable extends JFrame {
	
	String[] columnName = {"이름", "직업", "나이"};
	Object[][] data = {
			{"김연아", "운동선수", new Integer(30)},
			{"전지현", "배우", 40},
			{"유재석", "개그맨", 50},
			{"웬디", "가수", 17}
	};
	
	Ex12_09_JTable() {
		JTable table = new JTable(data, columnName);
		
		// 테이블을 스크롤바 패널위에 올림
		JScrollPane sPane = new JScrollPane(table);
		Container contentPain = getContentPane();
		contentPain.add(sPane, BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		
		
		Ex12_09_JTable ex = new Ex12_09_JTable();
		ex.setTitle("JTable");
		ex.setVisible(true);
		ex.setSize(500, 300);
		ex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
