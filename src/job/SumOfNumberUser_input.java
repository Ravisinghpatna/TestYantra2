package job;

import java.util.Scanner;

public class SumOfNumberUser_input {

	public static void main(String[] args) {
		Scanner s =new Scanner (System.in);
		System.out.println("enter the first number");
		int a = s.nextInt();
		System.out.println("enter the second num");
		int b=s.nextInt();
		
		int c=a+b;
		
	
		System.out.println("sum of a + b= "+c);

	}

}
