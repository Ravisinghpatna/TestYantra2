package Ravi;

import java.util.Scanner;

public class LCM {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the first number");
		int first = sc.nextInt();
		System.out.println("Enter the second num");
		int second=sc.nextInt();
		
		
		int st=0;
		for(int i=1;i<=first;i++)
		{
			if(first%i==0&& second%i==0)
			{
				st=i;
			}
		}
		int n=first*second/st;
		System.out.println("lcm is="+n);
	}

}
