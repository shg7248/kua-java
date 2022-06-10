package 연습용;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

class MyJFrame extends JFrame {
	
	static final int FRAME_WIDTH = 700;
	static final int FRAME_HEIGHT = 300;
	
	static final int SCROLL_X = 250;
	static final int SCROLL_Y = 10;
	static final int SCROLL_WIDTH = 440;
	static final int SCROLL_HEIGHT = 280;
	
	static final int PANEL1_X = 10;
	static final int PANEL1_Y = 10;
	static final int PANEL1_WIDTH = 230;
	static final int PANEL1_HEIGHT = 150;
	
	static final int PANEL2_X = 10;
	static final int PANEL2_Y = 170;
	static final int PANEL2_WIDTH = 230;
	static final int PANEL2_HEIGHT = 120;
	
	static final int PANEL1_GRID_ROW = 4;
	static final int PANEL1_GRID_COLUMN = 1;
	
	static final int PANEL2_GRID_ROW = 2;
	static final int PANEL2_GRID_COLUMN = 2;
	
	static final int BUTTON_WIDTH = 100;
	static final int BUTTON_HEIGHT = 20;

	static final int TEXTFIELD_SIZE = 10;
	
	static final int ADD = 0;
	static final int REMOVE = 1;
	static final int PRINT = 2;
	static final int EXIT = 3;
	
	static final String FILE_URL = "C:\\sun\\table.txt";
	
	JTable table;
	
	String[] caption = {"이름", "국어", "영어", "수학"};
	ArrayList<JTextField> tfs = new ArrayList<JTextField>();
	
	String[] buttonCaption = {"추가", "삭제", "파일출력", "종료"};
	ArrayList<JButton> buttons = new ArrayList<JButton>();
	
	Vector<String> columnName;
	Vector<Vector<String>> data;
	
	boolean flag = false;
	
	MyJFrame(String title) {
		super(title);
		
		columnName = new Vector<String>();
		data = new Vector<Vector<String>>();
		
		getData();
		init();
	}
	
	private void init() {
		
		Container contentPane = getContentPane();
		contentPane.setLayout(null);
		
		// Panel 1
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(PANEL1_GRID_ROW, PANEL1_GRID_COLUMN));
		
		// Panel 1-1
		for(int i = 0; i < PANEL1_GRID_ROW; i++) {
			JPanel jp = new JPanel();
			JLabel lb = new JLabel();
			lb.setText(caption[i]);
			JTextField tf = new JTextField(TEXTFIELD_SIZE);
			tfs.add(tf);
			jp.add(lb);
			jp.add(tf);
			p1.add(jp);
		}
		
		p1.setBounds(PANEL1_X, PANEL1_Y, PANEL1_WIDTH, PANEL1_HEIGHT);
		contentPane.add(p1);
		
		
		// Panel 2 .. 추가 / 삭제 / 파일출력 / 종료
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(PANEL2_GRID_ROW, PANEL2_GRID_COLUMN));
		
		
		for(int i = 0; i < buttonCaption.length; i++) {
			JPanel btnPane = new JPanel();
			btnPane.setLayout(null);

			JButton btn = new JButton(buttonCaption[i]);
			
			int location_w = (int)(PANEL2_WIDTH * 0.25) - (BUTTON_WIDTH / 2);
			int location_h = (int)(PANEL2_HEIGHT * 0.25) - (BUTTON_HEIGHT / 2);
			
			btn.setSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
			btn.setLocation(location_w, location_h);
			buttons.add(btn);
			btnPane.add(btn);
			p2.add(btnPane);
		} // init
		
		// Event
		buttons.get(ADD).addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel dtm = (DefaultTableModel)table.getModel();
				Vector<String> vector = new Vector<String>();
				String txt = null;
				for(JTextField jtf : tfs) {
					try {
						txt = jtf.getText();
						if(txt.equals("")) {
							throw new NullPointerException();
						}
					} catch(NullPointerException npe) {
						JOptionPane.showMessageDialog(null, "빈칸을 입력하세요!");
						jtf.requestFocus();
						return;
					}
					vector.add(txt);
				}
				dtm.addRow(vector);
				
				for(JTextField t : tfs) {
					t.setText("");
				}
			}
		});
		
		buttons.get(REMOVE).addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					DefaultTableModel dtm = (DefaultTableModel)table.getModel();
					dtm.removeRow(table.getSelectedRow());
				}catch(ArrayIndexOutOfBoundsException aiobe) {
					JOptionPane.showMessageDialog(null, "삭제할 목록을 선택하세요!");
				}
			}
		});
		
		buttons.get(PRINT).addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				BufferedWriter bw = null;
				try {
					bw = new BufferedWriter(new FileWriter(FILE_URL));
					
					int rowCount = table.getRowCount();
					int columnCount = table.getColumnCount();
					
					String columnName = "";
					for(int i = 0; i < columnCount; i++) {
						String col = table.getColumnName(i);
						if(i < columnCount - 1) {
							columnName += (i + "/");
						}
						else {
							columnName += i;
						}
					}
					System.out.println(columnName);
					bw.write(columnName);
					bw.newLine();
					
					for(int i = 0; i < rowCount; i++) {
						String row = "";
						for(int j = 0; j < columnCount; j++) {
							Object obj = table.getValueAt(i, j);
							row += (String)obj;
							if(j < columnCount - 1) {
								row += "/";
							}
						}
						bw.write(row);
						bw.newLine();
					}
					
				} catch (IOException e1) {
					e1.printStackTrace();
				} finally {
					try {
						bw.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		
		buttons.get(EXIT).addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int i = JOptionPane.showConfirmDialog(null, "정말로 종료하시겠습니까?");
				if(i == 1) 
					return;
				else 
					System.exit(0);
				
			}
		});
		
		p2.setBackground(Color.YELLOW);
		p2.setBounds(PANEL2_X, PANEL2_Y, PANEL2_WIDTH, PANEL2_HEIGHT);
		contentPane.add(p2);
		
		table = new JTable(data, columnName);
		
		JScrollPane scroll = new JScrollPane(table);
		scroll.setBounds(SCROLL_X, SCROLL_Y, SCROLL_WIDTH, SCROLL_HEIGHT);
		contentPane.add(scroll);
		
		setVisible(true);
		setSize(FRAME_WIDTH + 15, FRAME_HEIGHT + 38); // 715
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
	}
	
	private void getData() {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(FILE_URL));
			
			String line;
			while((line = br.readLine()) != null) {
				String[] arr = line.split("/");
				if(!flag) {
					for(String str : arr) {
						columnName.add(str);
					}
					flag = !flag;
				}
				else {
					Vector<String> vector = new Vector<String>();
					for(String str : arr) {
						vector.add(str);
					}
					data.add(vector);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Ex12_11_송학관{
	public static void main(String[] args) {
		
		new MyJFrame("학점관리");
	}
}
