import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

class Sub10 extends JFrame {
	
	Container contentPain = null;
	JTable table = null;
	JScrollPane scroll = null;
	
	Vector<String> columnName = null;
	Vector<Vector<String>> data = null; // 중첩 벡터
	
	boolean flag = true;
	
	Sub10(String title) {
		super(title);
		
		columnName = new Vector<String>();
		data = new Vector<Vector<String>>();
		
		getFile();
		compose();
		
		setSize(500, 300);
		setResizable(false);	// 크기변경 불가
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	private void compose() {
		
		contentPain = getContentPane();
		table = new JTable(data, columnName);
		scroll = new JScrollPane(table);
		
		contentPain.add(scroll, BorderLayout.CENTER);
		
		JButton btn = new JButton();
		btn.setText("출력");
		contentPain.add(btn, BorderLayout.SOUTH);
		
		btn.addActionListener(new TablePrint(table));
	}
	
	class TablePrint implements ActionListener {

		JTable table;
		
		TablePrint(JTable table) {
			this.table = table;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
//			for(String str : columnName) {
//				System.out.print(str + "\t");
//			}
//			System.out.println();
//			for(Vector<String> vec : data) {
//				for(String str : vec) {
//					System.out.print(str + "\t");
//				}
//				System.out.println();
//			}
			int rowCount = table.getRowCount();
			int columnCount = table.getColumnCount();
			
			for(int i = 0; i < columnCount; i++) {
				String colName = table.getColumnName(i);
				System.out.print(colName + "\t");
			}
			System.out.println();
			for(int i = 0; i < rowCount; i++) {
				for(int j = 0; j < columnCount; j++) {
					Object obj = table.getValueAt(i, j);
					System.out.print(obj + "\t");
				}
				System.out.println();
			}
		}
	}

	private void getFile() {
		try {
			BufferedReader br = 
					new BufferedReader(new FileReader("C:\\sun\\table.txt"));
			
			String line;
			while((line = br.readLine()) != null) {
				tableMake(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void tableMake(String line) {
		//line : 이름/국어/영어/수학
		//JTable의 제목자리
		//JTable의 내용자리 작성
		
		String[] tokens = line.split("/");
		if(flag) {
			
			for(String sub : tokens) {
				columnName.add(sub);
			}
			flag = !flag;
		}
		else {
			
			Vector<String> scores = new Vector<String>();
			for(String score : tokens) {
				scores.add(score);
			}		
			data.add(scores);
		}
	}
}

public class Ex12_10_JTable {
	
	public static void main(String[] args) {
		
		new Sub10("JTable");
	}
}
