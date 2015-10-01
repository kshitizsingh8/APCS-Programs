package Stuff;

import java.util.ArrayList;

public class NewNumbers 
{
	public static void getList (ArrayList<Integer> b)
	{
		
		int k = b.size ();
		for (int i = 0; i < k; i++)
		{
			b.add (b.get(i));
			b.set (i, 2 * b.get (i));
		}
		System.out.println (b);
	}
	
	public static void main(String[] args) 
	{
		ArrayList<Integer> a = new ArrayList<Integer> ();
		a.add (1);
		a.add (2);
		a.add (3);
		getList (a);
	}

}
