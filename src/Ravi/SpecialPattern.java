package Ravi;

import java.util.Scanner;

public class SpecialPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int n=sc.nextInt();
		int x=1;
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=n;j++)
			{
				System.out.print(x);
				x++;
				if(x>9)
				{
					x=1;
				}
			}
			System.out.println();
		}
	}

}
