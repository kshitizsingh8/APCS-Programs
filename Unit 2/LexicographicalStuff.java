package Stuff;

import java.util.Arrays;

public class LexicographicalStuff 
{
	public static void main(String[] args) 
	{
		int [] list = {1, 2, 3, 4, 5, 6};
		for (int i = 0; i < 720; i++)
		{
			System.out.println (Arrays.toString(list));
			getOrder (list);
		}
	}

	public static void getOrder(int arr[]) {
		for (int i = arr.length - 2; i >= 0; i--) 
		{
			if (arr[i] < arr[i + 1]) 
			{
				for (int j = arr.length - 1; j >= i; j--) 
				{
					if (arr[i] < arr[j]) {
						int x = arr[i];
						arr[i] = arr[j];
						arr[j] = x;
						break;
					}
					
				}
				int p = i + 1;
				int q = arr.length - 1;
				while (p < q) 
				{
					int y = arr[p];
					arr[p] = arr[q];
					arr[q] = y;
					p++;
					q--;
				}
				break;
			}
			
			
		}

	}
}
