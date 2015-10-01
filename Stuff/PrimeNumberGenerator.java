package Stuff;

import java.util.*;

public class PrimeNumberGenerator 
{
	public static int countPrimes (int n)
	{
		int counter = 0;
		
		for (int i = 2; i <= n; i++)
		{
			boolean prime = true;
			for (int j =2; j <= i-1; j++)
			{
				if ((i % j == 0))
				{
					prime = false;
					break;
				}			
			
			}
			
			if (prime == true)
			{
				counter++;
			}
		}
		
		return counter;
	}
	
	public static void main (String [] args)
	{
		Scanner scan = new Scanner (System.in);
		int input = scan.nextInt();
		System.out.println (countPrimes(input));
		scan.close ();
	}
}
