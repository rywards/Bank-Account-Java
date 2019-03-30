
// 3/15/2018
// Lab 3 Bank Account Class

import javax.swing.JOptionPane;

public class BankAccount {
	private String name;
	private int accountNum;
	private int pinNumber;
	private double balance;
	
	// Constructor that gives values to all members of the bankAccount class
	public BankAccount(){
		name = "";
		accountNum = 0;
		pinNumber = 0;
		balance = 0.0;
	}

	
	// Set of constructors that give the user flexibility on creating a bank account
	public BankAccount(int accountNum){
		this.accountNum = accountNum;
	}
	
	public BankAccount(int accountNum, String name){
		this.accountNum = accountNum;
		this.name = name;
	}
	
	public BankAccount(int accountNum, String name, int pinNumber){
		this.accountNum = accountNum;
		this.name = name;
		this.pinNumber = pinNumber;
		if  (pinNumber < 0 ){
			JOptionPane.showMessageDialog(null, "Invalid PIN! Enter again please.", "Error warning", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
	public BankAccount(int accountNum, String name, int pinNumber, double initialDeposit){
		this.accountNum = accountNum;
		this.name = name;
		this.pinNumber = pinNumber;
		this.balance = initialDeposit;
		if  (pinNumber < 0 ){
			JOptionPane.showMessageDialog(null, "Invalid PIN! Enter again please.", "Error warning", JOptionPane.ERROR_MESSAGE);
		}
		if  (initialDeposit < 0 ){
			JOptionPane.showMessageDialog(null, "Invalid deposit! Enter again please.", "Error warning", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
	// Name getters and setters
	public String getName(){
		return name;
	}
	
	public void setName(String value){
		name = value;
	}
	
	//	Account number getters and setters
	public int getAccountNum(){
		return accountNum;
	}
	
	public void setAccountNum(int value){
		accountNum = value;
	}
	
	// Getters and setters for the pin number
	public int getPIN(){
		return pinNumber;
	}
	
	public void setPIN(int value){
		pinNumber = value;
	}
	
	// Getters and setters for balance
	public double getBalance(){
		return balance;
	}
	
	public void setBalance(double value){
		balance = value;
	}
	
	// withdraw and deposit methods
	public double withdraw(double amount){
		balance = balance - amount;
		return balance;
	}
	
	public double deposit(double amount){
		balance = balance + amount;
		return balance;
	}
	
	public void accountTransfer(double amount, BankAccount transferBalance ){
		this.balance = balance - amount;
		if (this.balance < 0){
			System.out.println("You're transferring too much, transfer less.");
		}
		transferBalance.deposit(amount);
		
	}
	
	public String accountString(){
		String idString = "ID: " + String.valueOf(accountNum);
		String pinString = "PIN: " + String.valueOf(pinNumber);
		String balString = "Balance: $" + String.valueOf(balance);
		String account = "Name: " + name + " || "  + idString + " || " + pinString + " || " + balString;
		return account;
		
	}
	
}
	


