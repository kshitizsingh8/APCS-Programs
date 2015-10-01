package Stuff;

public class BinarySearch
{
	public static int pos (int [] arr, int x)
	{
		int n = arr.length;
		int start = 0;
		int end = n - 1;
		while (start <= end)
		{
			int mid = (start + end)/2;
			if (arr [mid] < x)
			{
				start = mid + 1;
			}
			
			else if (arr [mid] == x)
			{
				if (start == n - 1 || arr [mid] < arr [mid + 1])
				{
					return mid;
				}
			}
			
			else
			{
				start = mid - 1;
			}
			
		}
	}
	
	public static void main(String[] args) 
	{
		int [] list = new int [] {1, 2, 3, 4, 5, 5};
		pos (list, 4);

	}

}
