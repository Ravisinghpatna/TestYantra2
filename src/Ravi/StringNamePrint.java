package Ravi;

import java.util.Scanner;

public class StringNamePrint {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the Name");
//		String str=sc.next();
		String str="ravi";
		//char[]ch=str.toCharArray();
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<=i;j++)
			{
				char ch =str.charAt(j);

				System.out.print(ch);
			}
			System.out.println();
		}
	}

}
