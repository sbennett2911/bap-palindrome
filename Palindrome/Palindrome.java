/***********************************************************************
 Program Name: Palindrome.java
 Programmer's Name: Steven Bennett
 Program Description: Program accepts sequence of five integers and
 checks if sequence is a palindrome.
 ***********************************************************************/ 

import javax.swing.JOptionPane;

public class Palindrome {
	
	public static void main(String[] args) {
		
		display(check(retrieveInput()));
		
		//terminate program
		System.exit(0);
		
	}
	
	/*retrieveInput() gathers and tests user input.  Number entered must be 5 digits in length.
	 *The userInput is parsed and returned as integer testSequence*/
	public static int retrieveInput(){
		String userInput;
		int testSequence = 0;
		boolean done = false;
		
		while (!done){
			userInput = JOptionPane.showInputDialog("Enter a 5 digit number.");
			if (userInput.length() == 5){
				testSequence = Integer.parseInt(userInput);
				done = true;
			} else {
				JOptionPane.showMessageDialog(null, "Invalid input! Number must be 5 digits.",
						"D A T A  E R R O R", JOptionPane.ERROR_MESSAGE);
			}
		}
	
		return testSequence;
	}
	
	/*check() method accepts an integer and separates the number into individual digits.  The digits
	 * are then check to determine if the number is a palindrome.  A boolean is returned verifying if the
	 * number is a palindrome.*/
	public static boolean check(int number){
		
		//separate user input into separate digits to compare.
		int digit1 = number / 10000;
		int digit2 = number % 10000 / 1000;
		int digit4 = number % 100 / 10;
		int digit5 = number % 10;
		boolean isPalindrome;
		
		//test if entered sequence is a palindrome
		if ((digit1 == digit5) && (digit2 == digit4)){
			isPalindrome = true;
		} else {
			isPalindrome = false;
		}
		
		return isPalindrome;
	}
	
	/*display() method accepts a boolean and displays the appropriate message letting the user know
	 * if the sequence entered was a palindrome or not.*/
	public static void display(boolean check){
		//display appropriate message if the sequenced checked was a palindrome
		if (check == true){
			JOptionPane.showMessageDialog(null, "The number entered is a palindrome", "Palindrome Test", JOptionPane.PLAIN_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "The number entered is NOT a palindrome", "Palindrome Test", JOptionPane.PLAIN_MESSAGE);
		}
	}


}
