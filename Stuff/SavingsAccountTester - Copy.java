package Stuff;

public class SavingsAccountTester 
{

	public static void main(String[] args) 
	{
		SavingsAccount savings = new SavingsAccount ();
		savings.addInterest ();
		System.out.println (savings.getBalance());

	}

}
