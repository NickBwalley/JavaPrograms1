package eventhandlers;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class WorldCup2018 extends JFrame {
	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	private JTextField item4;
	
	public WorldCup2018() {
		super("WorldCup2018!");
		setLayout(new FlowLayout());
		
		item1 = new JTextField("Who Won the Mens WorldCup 2018?", 30);
		item1.setEditable(false);
		add(item1);
		
		item2 = new JTextField(10);
		add(item2);
		
		item3 = new JTextField("Who Won the Womens WorldCup 2018?", 30);
		item3.setEditable(false);
		add(item3);
		
		item4 = new JTextField(10);
		add(item4);
		
		actionList list = new actionList();
		item2.addActionListener(list);
		item4.addActionListener(list);
				
	}
	
	private class actionList implements ActionListener{
		
		public void actionPerformed(ActionEvent event) {
			String juice = "";
			if(event.getSource() == item2)
				juice = String.format("Your Choice was: %s", event.getActionCommand()); 
			else if(event.getSource() == item4)
				juice = String.format("Your Choice was: %s", event.getActionCommand());
			
			JOptionPane.showMessageDialog(null, juice);
			
		}
		
	}
	
}
