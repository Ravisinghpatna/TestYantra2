package Demo;

import java.util.Scanner;

public class Lcm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first no");
		int lcm1 = sc.nextInt();
		System.out.println("Enter the second no");
		int lcm2=sc.nextInt();
		int add = 0;
		for(int i=1;i<=lcm1;i++)
		{
			if(lcm1%i==0 &&lcm2%i==0)
			{
				add=i;
			}
		}
		int lcm=lcm1*lcm2/add;
		System.out.println("Lcm of "+lcm1+","+lcm2+" is "+lcm);
	}

}
