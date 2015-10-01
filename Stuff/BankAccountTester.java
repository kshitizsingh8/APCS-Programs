package Stuff;

public class BankAccountTester 
{

	public static void main(String[] args) 
	{
		BankAccount savings = new BankAccount ();
		savings.depositMoney(1000);
		savings.removeMoney(400);
		savings.addInterest(0.1);
		System.out.println (savings.getBalance ());
		


	}

}
