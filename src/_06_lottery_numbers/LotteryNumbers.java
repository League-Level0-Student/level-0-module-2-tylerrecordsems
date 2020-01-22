package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
public static void main(String[] args) {
	
	
	int randomChoice = 0;
	int randomChoices = 0;
	Random lottery = new Random ();
	randomChoice=lottery.nextInt((6522935 - 6522930)+1) + 6522930;                                                                                                          
	System.out.println(randomChoice);
	
	JOptionPane.showMessageDialog(null,"Your Lottery number is " +randomChoice);
	randomChoices=lottery.nextInt((6522935 - 6522930)+1) + 6522930; 
	JOptionPane.showMessageDialog(null,"Wellcome to Lottery 101 the number for $1 000 000 is " +randomChoices);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
