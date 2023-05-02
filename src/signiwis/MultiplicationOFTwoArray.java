package signiwis;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiplicationOFTwoArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of a matrix");
		int row = sc.nextInt();
		int col=sc.nextInt();

		int first [][]=new int[row][col];
		int second [][]=new int[row][col];
		int sum [][]=new int[row][col];	

		System.out.println("enter the  first 3x3 matrix");

		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				first[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter the second 3x3 matrix");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				second[i][j]=sc.nextInt();
			}
		}

		//MULTIPLICATION
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				sum[i][j]=first[i][j]* second[i][j];
			}
		}

		System.out.println("Sum of matrix");

		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
	}
}

