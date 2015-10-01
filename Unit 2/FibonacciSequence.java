package Stuff;

import java.util.*;

public class FibonacciSequence 
{
	public static long fibonacci (long numbers)
	{
		long num1 = 0;
		long num2 = 1;
		long total = 1;
		for (int i = 1; i < numbers; i++ )
		{
			total = num1 + num2;
			num1 = num2;
			num2 = total;
			System.out.print (num1 + " ");
		}
		
		return total;
	}
	
	

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println ("How many Fibonacci numbers do you want to see?");
		long input = scan.nextLong ();
		System.out.println (fibonacci (input));
		scan.close ();

	}

}
