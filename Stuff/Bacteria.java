package Stuff;

import java.util.*;

public class Bacteria 
{
	public static int getBacteria (int num)
	{
		int counter = 0;
		for (int i = num; i > 0; i = i/2)
		{
			if (i % 2 == 1)
			{
				counter++;
			}	
		}
		
		return counter;
	}
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		int total = scan.nextInt ();
		System.out.println (getBacteria (total));
		scan.close ();

	}

}
