package Stuff;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultiplication 
{	
	public static void multiply (int [][] arr1, int [][] arr2)
	{
		int row1 = arr1.length;
		int row2 = arr2.length;
		int column2 = arr2[0].length;
		int [][] product = new int [row1][column2];
		for (int i = 0; i < row1; i++)
		{
			for (int j = 0; j < column2; j++)
			{
				for (int k = 0; k < row2; k++)
				{
					product[i][j] += arr1[i][k] * arr2[k][j];
				}
			}
		}
		
		if (! (row1 == column2))
		{
			int [][] blank = new int [1][1];
			System.out.println (Arrays.toString (blank));
			
		}
		for (int[] x : product) System.out.println (Arrays.toString (x));
}
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		int [][] matrix1 = new int [][] {{1, 2, 3},{2,3,4},{4,5,6}};
		int [][] matrix2 = new int [][] {{5,1,6},{3,7,4},{4,4,4}};
		multiply (matrix1, matrix2);
		scan.close ();
	}
}
