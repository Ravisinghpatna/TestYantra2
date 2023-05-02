package bjshub;

import java.util.Scanner;

public class PrintNextLetter {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
	String name = sc.nextLine();
	String s1="";
	
	
	for(int i=0;i<name.length();i++)
	{
		char ch=name.charAt(i);
		s1=s1+(char)(ch+1);
		
		
	}
	System.out.println("After Updating the Value");
	System.out.println(s1);
	System.out.println("Updating After Reverse the Letter ");
	for(int i=s1.length()-1;i>=0;i--)
	{
		char c=s1.charAt(i);
		System.out.print(c);
	}
	
}
}
