package Stuff;


import java.util.*;

public class Summation 
{
	public static int getSummation (int numbers)
	{
		int sum = 0;
		for (int i = 0; i <= numbers; i++)
		{
			sum += i;
		}
		
		return sum;
	}
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		int summation = scan.nextInt ();
		long total = getSummation (summation);
		System.out.println (total);
		scan.close ();
	}
	
	

}
