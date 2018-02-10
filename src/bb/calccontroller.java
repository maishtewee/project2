package bb;

import java.awt.event.*;

import javax.swing.JButton;

public class calccontroller implements ActionListener {
calcmodel model =new calcmodel();
calcview view=new calcview();
String x="";

public calccontroller
() {}
public calccontroller(calcmodel model,calcview view ) {
	this.view=view;
	this.model=model;
	view.addlistener(this);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource()==view.buttons [3]) {
			x =x+view.names[3];
		view.result.setText(x);
			view.result.setEditable(true);
			
		}
	
		if (e.getSource()==view.buttons [1]) {
			x =x+view.names[1];
		view.result.setText(x);
			view.result.setEditable(true);
			
		}
		
		if (e.getSource()==view.buttons [2]) {
			x =x+view.names[2];
			view.result.setText(x);
			view.result.setEditable(true);
		}
		if (e.getSource()==view.buttons [5]) {
			x =x+view.names[5];
			view.result.setText(x);
			view.result.setEditable(true);
		}
		
		if (e.getSource()==view.buttons [6]) {
		x =x+view.names[6];
			view.result.setText(x);
			view.result.setEditable(true);
		}
		if (e.getSource()==view.buttons [7]) {
			x =x+view.names[7];
			view.result.setText(x);
			view.result.setEditable(true);
		}
		
		if (e.getSource()==view.buttons [8]) {
			view.first =Double.parseDouble(view.result.getText());
			view.result.setText("");
			view.opr="*";
			x="";
		}
		if (e.getSource()==view.buttons [9]) {
			view.first =Double.parseDouble(view.result.getText());
			view.result.setText("");
			view.opr="/";
			x="";
		}
		
		if (e.getSource()==view.buttons [10]) {
			x =x+view.names[10];
			view.result.setText(x);
			view.result.setEditable(true);
		}

		if (e.getSource()==view.buttons [11]) {
			x =x+view.names[11];
			view.result.setText(x);
			view.result.setEditable(true);
		}
		

		if (e.getSource()==view.buttons [12]) {
			x =x+view.names[12];
			view.result.setText(x);
			view.result.setEditable(true);
		}
		
		if (e.getSource()==view.buttons [13]) {
			view.first =Double.parseDouble(view.result.getText());
		view.	result.setText("");
		view.opr="+";
			x="";
			
		}
		
		
		if (e.getSource()==view.buttons [14]) {
			view.first =Double.parseDouble(view.result.getText());
		view.	result.setText("");
		view.opr="-";
			x="";
			
		}
		if (e.getSource()==view.buttons [15]) {
			x =x+view.names[15];
			view.result.setText(x);
			view.result.setEditable(true);
		}
		
		
		
		if (e.getSource()==view.buttons [16]) {
			x =x+view.names[16];
			view.result.setText(x);
			view.result.setEditable(true);
			}
			

		if (e.getSource()==view.buttons [17]) {
			view.first =Double.parseDouble(view.result.getText());
		view.	result.setText("");
		view.opr="sqr";
			x="";
			model.sqr(view.first);
			
			
			view.result.setText(Double.toString(model.result()));
			
		}
		
		
		

		if (e.getSource()==view.buttons [18]) {
			view.first =Double.parseDouble(view.result.getText());
		view.result.setText("");
		view.opr="%";
			x="";
			
		}
		if (e.getSource()==view.buttons [19]) {
			x="";
			String answ;
			view.second =Double.parseDouble(view.result.getText());
			if(view.opr == "+") {
			model.add(view.first, view.second);
				
			
			view.result.setText(Double.toString(model.result()));
				
			}	
		
			if(view.opr == "-") {
				model.sub(view.first, view.second);
					
				
				view.result.setText(Double.toString(model.result()));
					
				}	
			
			
			if(view.opr == "*") {
				model.mul(view.first, view.second);
					
				
				view.result.setText(Double.toString(model.result()));
					
				}	
			if(view.opr == "/") {
				model.div(view.first, view.second);
					
				
				view.result.setText(Double.toString(model.result()));
					
				}	
			
			if(view.opr == "%") {
				model.mod(view.first, view.second);
					
				
				view.result.setText(Double.toString(model.result()));
					
				}	
			
			
		
	}

	}
	}
	
	


