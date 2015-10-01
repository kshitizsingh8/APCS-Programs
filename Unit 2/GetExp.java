package Stuff;

public class GetExp 
{

	public static String getExp (String str, int i)
	{
		int length = str.length (); 
		String answer = "";
		int openParenthesis = 0;
		for (int j = i; j < length; j++)
		{
			if (str.charAt(j) == '(')
			{
				openParenthesis++;
			}
			
			else if (str.charAt(j) == ')')
			{
				openParenthesis--;
			}
			
			if (openParenthesis == 0)
			{
				answer = str.substring(i, j + 1);
			}
		}
		
		return answer;
	}
	public static void main(String[] args) 
	{
		String list = "abc(b(a)aac)(ccc(qa(b))ad)";
		int counter = 0;
		for (int j = 0; j < list.length (); j++ )
		{
			if (list.charAt (j) == '(')
			{
				System.out.println (getExp (list, j));
				counter++;
			}
			
		}
		
		System.out.println (counter);

	}

}
