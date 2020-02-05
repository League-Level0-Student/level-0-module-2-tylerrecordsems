package _15_voting_booth;

import javax.swing.JOptionPane;

public class voting_booth {
public static void main(String[] args) {
	
	
	
	
	
	String inch = JOptionPane.showInputDialog(null, "How old are you (years)");
	int inche = Integer.parseInt(inch);
	if (inche >= 18) {
		JOptionPane.showMessageDialog(null, "Who should be the next president");

	} else
		JOptionPane.showMessageDialog(null, "Nobody cares what you think");
}
}
