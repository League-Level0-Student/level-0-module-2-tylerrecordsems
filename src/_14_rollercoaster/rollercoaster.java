package _14_rollercoaster;

import javax.swing.JOptionPane;

public class rollercoaster {
	public static void main(String[] args) {

		String inch = JOptionPane.showInputDialog(null, "How tall are you (inches)");
		int inche = Integer.parseInt(inch);
		if (inche >= 48) {
			JOptionPane.showMessageDialog(null, "Congratulations! You brought tall enough shoes ");

		} else
			JOptionPane.showMessageDialog(null, "Sorry but you didn't bring your stilts");

	}

}
