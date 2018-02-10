package bb;
import java.awt.event.*;

import java.awt.*;
import javax.*;
import javax.swing.*;



	public class calcview  extends JFrame{
//calccontroller h=new calccontroller();
		
		
		public JButton[] buttons;
		public static final String[]names= {"7","8","9","-","AC","4","5","6","*","/","1","2","3","+","-","0",".","sqr","%","="};
		public JTextField result;
		public JPanel keys;
		String x="";
		Double first;
		Double second;
		String opr;
		Double r;
	int f=0;
	public calcview() {
		keys=new JPanel();
		keys.setLayout(new GridLayout(4,5));
		buttons =new JButton[names.length];
		for (int count =0;count<names.length;count++) {
			buttons [count]=new JButton(names[count]);
			
			keys.add(buttons[count]);

	
			}
			
		
		result =new JTextField("");
		result.setHorizontalAlignment(JTextField.RIGHT);
		Font font=new Font("SansSerif",Font.BOLD,20);
		result.setFont(font);
		add(result,BorderLayout.NORTH);
		add(keys,BorderLayout.CENTER);
		
	
	
	
		
	
}
	
	
	void addlistener(ActionListener m) {
		
		
		for (int count =0;count<names.length;count++) {
			
		buttons [count].addActionListener(m);
		
		
			}
			
		
	}
	
	
	
	
	}
