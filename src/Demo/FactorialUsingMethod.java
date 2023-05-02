package Demo;

import java.util.Scanner;

public class FactorialUsingMethod {

	public static void factorailOfNum(int n)
	{
		if(n<0)
		{
			System.out.println("invalid input");
			return;
		}
		//void
		int fact=1;
		for(int i=n;i>=1;i--)
								//for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
			System.out.println(fact);
		//return fact;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of factorial");
		int n=sc.nextInt();

		//int fact = factorailOfNum(n);
					factorailOfNum(n);
		//System.out.println(fact);

	}
}


