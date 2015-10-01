package Stuff;

import javax.swing.JOptionPane;

public class ZerosAndOnes 
{	
	public static int getList (String number)
	{
		int times = 0;
		int length  = number.length ();
		while (length > 0)
		{
			if (number.charAt (0) == '0' && number.charAt (1) == '1')
			{
				times++;
			}
			
			else if (number.charAt (0) == '1' && number.charAt (1) == '0')
			{
				times++;
			}	
			
			number = number.replace (number.substring (0, 1), "");
		}
		
		
		return times;
	}
	public static void main(String[] args)
	{
		String number = JOptionPane.showInputDialog ("Please enter a number with only zeros and ones");
		System.out.println (getList (number));

	}

}
