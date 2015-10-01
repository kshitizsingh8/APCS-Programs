package Stuff;

import java.util.*;

public class Game24 
{	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		int limit = scan.nextInt ();
		if (limit <= 3)
		{
			System.out.println ("NO");
		}
		
		else
		{
			System.out.println ("YES");
			if (limit % 2 == 0)
			{
				int times = 0;
				for (int i = limit; i > 5; i-=2) 
				{
					System.out.println (i  + " - " + (i - 1) + " = " + "1");
					times++;

				}

				System.out.println ("1 * 2 = 2");
				System.out.println ("2 * 3 = 6");
				System.out.println ("6 * 4 = 24");
				for (int j = 0; j < times; j++ )
				{
					System.out.println ("24 * 1 = 24");
				}
			}
			
			else
			{
				int times = 0;
				for (int i = limit; i > 5; i-=2) 
				{
					System.out.println (i  + " - " + (i - 1) + " = " + "1");
					times++;
				}
				
				System.out.println ("5 * 4 = 20");
				System.out.println ("3 + 2 = 5");
				System.out.println ("5 - 1 = 4");
				System.out.println ("20 + 4 = 24");
				for (int j = 0; j < times; j++ )
				{
					System.out.println ("24 * 1 = 24");
				}
				
			}		
		}
		
		
		scan.close();
	}

}
