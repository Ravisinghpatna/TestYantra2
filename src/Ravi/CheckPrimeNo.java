package Ravi;

import java.util.Scanner;

public class CheckPrimeNo {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Check the no is prime or not");

		int p=0,np=0;
		int n=sc.nextInt();
		for(int i=1;i<=50;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
				p++;
			else
				np++;
		}
		System.out.println("prime---"+p);
		System.out.println("not prime---"+np);

	}	

}

