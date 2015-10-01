package Stuff;

public class SavingsAccount 
{
	public SavingsAccount (double initialRate, double initialBalance)
	{
		rate = initialRate;
		balance = initialBalance;
	}
	
	public SavingsAccount ()
	{
		rate = 0.1;
		balance = 1000;
	}
	
	
	public void addInterest ()
	{
		balance = (balance * rate) + balance;
	}
	
	public double getBalance ()
	{
		return balance;
	}
	
	public double rate;
	public double balance;
}
