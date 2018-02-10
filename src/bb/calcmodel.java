package bb;

import javax.swing.JOptionPane;

public class calcmodel {
	static double z;
public static double add(double x,double y) {
	z= x+y;
	return z;
	
}
public static double sub(double x,double y) {
	z=x-y;
	return z;
	
}
public static  double mul(double x,double y) {
	z=x*y;
	return z;
	
}
public static double div(double x,double y) {
	
if(y==0) {
		
		JOptionPane.showMessageDialog(null,"can not div on zero number");
		
	}
	if(y>0) {
		
	z=x/y;
	}
	
	return z;
	
}
public static double mod(double x,double y) {
	
	z=x%y;
	return z;
	
}
public static double sqr(double x) {
	if(x>0) {
		
		z=Math.sqrt(x);}
	if (x<0) {
		JOptionPane.showMessageDialog(null,"can not find sqr for negative number");
	
	}
	return z;
	
	
}
public double result() {
	return z;
	
	
}
}
