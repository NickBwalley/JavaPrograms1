package guijcheckbox;
import javax.swing.JFrame;
public class Main {

	public static void main(String[] args) {
		JCheckbox nicky = new JCheckbox();
		nicky.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		nicky.setSize(400,300);
		nicky.setLocation(400,100);
		nicky.setVisible(true);
	}

}
