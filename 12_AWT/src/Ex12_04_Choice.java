import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class Sub3 extends Frame {
	
	Choice ch;
	Label lb;
	
	Sub3(String title) {
		super(title);
		setSize(300, 200);
		setVisible(true);
		
		setLayout(new FlowLayout());
		lb = new Label("가나다라");
		
		ch = new Choice();
		ch.add("진달래");
		ch.add("장미");
		ch.add("개나리");
		ch.add("벚꽃");
		
		this.add(ch);
		this.add(lb);
		
		ch.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("choice 변화생김");
				System.out.println(ch.getSelectedIndex() + ":" + ch.getSelectedItem());
				
				lb.setText(ch.getSelectedItem());
			}
		});
	}
}

public class Ex12_04_Choice {
	public static void main(String[] args) {
		
		Sub3 s = new Sub3("Choice");
		
	}
}
