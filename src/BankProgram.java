
// 4/7/2018
// Lab 4 Working with the BankAccount Class

import java.util.*;

public class BankProgram {

	static int looper = 1;
	public static void main(String[] args) {
	    Scanner keyboard = new Scanner(System.in);
	    
		int accountNum = 0;
		int pinNumber = 0;
		int userSelection;
		int userInt;
		String userString;
		double deposit = 0;
		String name = "";
		
		
		
		
		while (looper > 0){
			
		System.out.println("Please choose what you would like to do at the bank:");
		System.out.println("1. Create an account.");
		userSelection = keyboard.nextInt();
		
		if (userSelection == 1){
			
			System.out.println("Enter your name: ");
			name = keyboard.nextLine();
			
			
			BankAccount account = new BankAccount(accountNum, name, pinNumber, deposit);
			
			System.out.println(account.accountString());
		}
		
		}
		keyboard.close();
	}
}
