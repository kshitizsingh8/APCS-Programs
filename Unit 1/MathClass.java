package Stuff;

public class MathClass 
{
	public static double squaringMethod (double value)
	{
		double square = value * value;
		return square;
	}
	
	public static double squareRoot (double value)
	{
		double sqrt = value / 2;
		double sqrt1 = (2 + sqrt)/2;
		double value2 = value / sqrt1;
		double sqrt2 = (value2 + sqrt1)/2;
		double value3 = (value2/sqrt2);
		double sqrt3 = (value3 + sqrt2)/2;
		double value4 = (value3/sqrt3);
		double sqrt4 = (value4 + sqrt3)/2;
		return sqrt4;
	}
	
	public static double getRoot1 (double a, double b, double c)
	{
		double root1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c))/(2 * a);
		return root1;
	}
	
	public static double getRoot2 (double a, double b, double c)
	{
		double root2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c))/(2 * a);
		return root2;
	}
	
	public static double raiseToPower (double number, double power)
	{
		double value = Math.pow(number, power);
		return value;
	}
	
	
}
