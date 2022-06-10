import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class AddSungjuk implements ActionListener {

	JTable table;
	JTextField[] tf;
	String[] str = new String[4];
	
	AddSungjuk(JTable table, JTextField[] tf) {
		this.table = table;
		this.tf = tf;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("클릭");
		
		for(int i = 0; i < tf.length; i++) {
			str[i] = tf[i].getText();
		}
		
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		model.addRow(str);
		
	}
}
