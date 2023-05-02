package signiwis2;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		int c = 0;
		int n=5;

		for(int i=1;i<=n;i++)
		{
			System.out.print(a+" ");

			c=a+b;
			a=b;
			b=c;
		}
	}
}
