package bb;

public class main {

	public static void main(String []args) {
	calcview c=new calcview();
		
		calcmodel l=new calcmodel();
		calccontroller t=new calccontroller(l,c);
//	c.setDefaultCloseOperation(EXIT_ON_CLOSE);
		c.setSize(300,400);
		c.setVisible(true);
		
		
		
		
	}
	

}
