import java.awt.Container;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

class Sub11 extends JFrame {
	
	String[] caption = {"이름", "국어", "영어", "수학"};
	JTextField[] tf = new JTextField[4];
	JButton btnAdd;
	
	Vector<String> columnName;
	Vector<Vector<String>> data;
	
	Boolean flag = false;
	
	JTable table;
	
	Sub11(String title) {
		super(title);
		
		columnName = new Vector<String>();
		data = new Vector<Vector<String>>();
		
		getData();
		compose();
		
		
		setSize(700, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void getData() {
		try {
			BufferedReader br = 
					new BufferedReader(new FileReader("C:\\sun\\table.txt"));
			
			String line;
			while((line = br.readLine()) != null) {
				
				String[] columnNames = line.split("/");
				
				if(!flag) {
					for(String c : columnNames) {
						columnName.add(c);
					}
					flag = !flag;
				}
				else {
					Vector<String> name = new Vector<String>();
					for(String c : columnNames) {
						name.add(c);
					}
					data.add(name);
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void compose() {
		
		Container contentPane = getContentPane();
		contentPane.setLayout(null); // 어떤 배치관리자도 사용하지 않겠다.
			
		table = new JTable(data, columnName);
		JScrollPane scroll = new JScrollPane(table);
		scroll.setBounds(200, 20, 600, 400);
		contentPane.add(scroll);

		
		// 라벨
		for(int i=0;i<4;i++) {
			JLabel lb = new JLabel();
			lb.setText(caption[i]); 
			lb.setBounds(10,(i+1)*30 , 50,20); 
			contentPane.add(lb);
			
			tf[i] = new JTextField();
			tf[i].setBounds(80,(i+1)*30 , 90,20);
			contentPane.add(tf[i]);
		}
		
		btnAdd = new JButton("추가");
		btnAdd.setBounds(20, 170, 90, 20);
		contentPane.add(btnAdd);
		
		btnAdd.addActionListener(new AddSungjuk(table, tf));
	}
}

public class Ex12_11_송학관 {
	
	public static void main(String[] args) {
		
		new Sub11("성적 처리");
	}
}
