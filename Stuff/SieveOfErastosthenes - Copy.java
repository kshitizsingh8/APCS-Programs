package Stuff;

public class SieveOfErastosthenes 
{
	public static void primeGenerator (int max)
	{
		boolean [] composites = new boolean [max + 1];
		for (int i = 2; i <= max; i++)
		{
			if (composites [i] == false)
			{
				for (int j = 2 * i; j <= max;j = j + i )
				{
					composites [j] = true;
				}
			}
		}
		
		for (int i = 2; i <= max; i++)
		{
			if (composites [i] == false)
			{
				System.out.print (i + " ");
			}
		}
	}

	public static void main(String[] args) 
	{
		primeGenerator(100);
	}

}
