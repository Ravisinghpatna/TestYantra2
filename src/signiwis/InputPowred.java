package signiwis;

import java.util.Scanner;

public class InputPowred {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		int input=sc.nextInt();
		
		int inpow=input*input*input*input*input;
		System.out.println("power of "+input+"'s is: "+"= "+inpow);
		

	}

}
