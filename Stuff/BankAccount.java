package Stuff;

public class BankAccount 
{

	public BankAccount (double initialBalance)
	{
		balance = initialBalance;
	}
	
	public BankAccount ()
	{
		balance = 0;
	}
	
	public void depositMoney (double amount)
	{
		balance = balance + amount;
	}
	
	public void removeMoney (double amount)
	{
		balance = balance - amount;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void addInterest (double rate)
	{
		balance = (balance * rate) + balance;
	}
	
	
	
	public double balance;
	public double amount;
}
