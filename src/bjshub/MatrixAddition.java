package bjshub;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the row");
		int row=sc.nextInt();
		System.out.println("Enter the column");
		int colu = sc.nextInt();

		int[][]	matrix =new int [row][colu];


		System.out.println("Enter the matrix");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<colu;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		int pd=0;
		int sd=0;

		for(int i=0;i<row;i++)
		{
			for(int j=0;j<colu;j++)
			{
				if(i==j)
				{
					pd=pd+matrix[i][j];
				}
				if(i+j== matrix.length-1)
				{
					sd=sd+matrix[i][j];
				}

			}
		}

		System.out.println("sum of diagonal primary "+pd);
		System.out.println("sum of diagonal secondary "+sd);
	}

}
