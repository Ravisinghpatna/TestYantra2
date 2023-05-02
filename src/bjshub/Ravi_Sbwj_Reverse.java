package bjshub;

import java.util.Scanner;

public class Ravi_Sbwj_Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.nextLine();
		String s1="";

		System.out.println("After change-");
		for(int i=0;i<name.length();i++)
		{
			char ch = name.charAt(i);
			ch=(char)(ch+1);
			s1=s1+ch;

		}
		System.out.println(s1);


		System.out.println("After Reverse-");
		for(int i=s1.length()-1;i>=0;i--)
		{
			char c=s1.charAt(i);
			System.out.print(c);
		}


	}

}
