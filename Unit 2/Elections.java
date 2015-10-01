package Stuff;

import java.util.*;

public class Elections 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		int candidates = scan.nextInt();
		int cities =  scan.nextInt();
		int [] candidateTotal = new int [cities];
		
		for (int i = 0; i < cities; i++)
		{
			int highestValue = -1;
			int highestIndex = 0;
			for (int j = 0; j < candidates;  j++)
			{
				int candidateVotes = scan.nextInt();
				if (candidateVotes > highestValue)
				{
					highestValue = candidateVotes;
					highestIndex = j;
				}
			
			}
			candidateTotal[highestIndex]++;
			
		}
		
		int cityTotal = -1;
		int maxCities = 0;
		int maxIndex = 0;
		for (int j = 0; j < candidates; j++ )
		{
			if (cities > cityTotal)
			{
				cityTotal = cities;
				cities = j;
			}
		}
		
		
		scan.close();	
	}
	

}
