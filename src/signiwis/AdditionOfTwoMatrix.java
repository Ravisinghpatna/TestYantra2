package signiwis;

import java.util.Scanner;

public class AdditionOfTwoMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int first [][]=new int[3][3];
		int second [][]=new int[3][3];
		int sum [][]=new int[3][3];	

		System.out.println("enter the  first 3x3 matrix");

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				first[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter the second 3x3 matrix");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				second[i][j]=sc.nextInt();
			}
		}

		//Addition
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				sum[i][j]=first[i][j]+ second[i][j];
			}
		}

		System.out.println("Sum of matrix");
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
	}

}
