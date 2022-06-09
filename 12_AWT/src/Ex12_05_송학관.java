import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Sub4 extends Frame {
	
	String[] 대륙 = {"아시아", "유럽", "아프리카"};
	
	String[][] 나라 = {
			{"한국", "일본", "중국"},
			{"영국", "스위스", "프랑스"},
			{"이집트", "콩고", "우간다"}
	};
	
	Choice ch1, ch2;
	Label lb1, lb2;
	int i1, i2;
	
	static int WIDTH = 300;
	
	Sub4(String title) {
		super(title);
		setVisible(true);
		setSize(WIDTH, 500);
		
		// Panel : 
		Panel p1 = new Panel();
		p1.setBackground(Color.yellow);
		Panel p2 = new Panel();
		p2.setBackground(Color.pink);
		Panel p3 = new Panel();
		p3.setLayout(new BorderLayout());
		p3.setBackground(Color.orange);
		
		// Choice
		ch1 = new Choice();
		for(String str : 대륙) {
			ch1.add(str);
		}
		
		ch2 = new Choice();
		ch2.add("             ");
		
		// Label
		// 기본 배치관리자는 FlowLayout
		lb1 = new Label("대륙과 나라를 선택하세요");
		lb2 = new Label();
		lb2.setAlignment(Label.CENTER);
		lb2.setPreferredSize(new Dimension(WIDTH, 30));
		
//		this.add(lb1);
//		this.add(ch1);
//		this.add(ch2);
//		this.add(lb2);
		
		p1.add(lb1);
		p2.add(ch1);
		p2.add(ch2);
		p3.add(lb2);
		
		this.add(p1, BorderLayout.NORTH);
		this.add(p2, BorderLayout.CENTER);
		this.add(p3, BorderLayout.SOUTH);
		
		ch1.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				ch2.removeAll();
				i1 = ch1.getSelectedIndex();
				for(String str : 나라[i1]) {
					ch2.add(str);
				}
			}
		});
		
		ch2.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				i2= ch2.getSelectedIndex();
				String str = "선택한 대륙과 나라는 : " + 대륙[i1] + "_" + 나라[i1][i2];
				lb2.setText(str);
			}
		});
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("프로그램 종료");
				System.exit(0);
			}
		
		});
	}
}

public class Ex12_05_송학관 {
	public static void main(String[] args) {
		
		new Sub4("오늘의 과제");
	}
}

// 대륙과 나라를 선택하세요
// 선택한 대륙과 나라는 : 유럽_스위스
