package Stuff;

import java.util.*;

public class PascalsTriangle 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println ("How many rows do you want to see?");
		int times = scan.nextInt ();
		int [][] triangle = new int [times][times];
		triangle [0][0] = 1;
		for (int i = 0; i < times; i++)
		{
			for (int j = 0; j < times; j++)
			{
				if (j == 0 || j == i)
				{
					triangle [i][j] = 1;
				}
				
				else if ( i == 0)
				{
					triangle [i][j] = 1;
				}
				
				else
				{
					triangle [i][j] = triangle [i -1][j] + triangle [i -1][ j -1];
				}
			}
		}
		
		for (int i = 0; i < times; i++)
		{
			for (int j = 0; j < i + 1; j++)
			{
				System.out.print(triangle [i][j] + " ");
			}
			System.out.println ();
		}
		
		
		scan.close ();
	}
	
}
