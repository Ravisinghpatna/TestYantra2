package bjshub;

import java.util.Scanner;

public class ConvertCapitalToSmall_Viceversa {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String name=sc.nextLine();
		
		
		for(int i=0;i<name.length();i++)
		{
			char c=name.charAt(i);
			if(c>='A' && c<='Z') {
				c=(char) (c+32);
			}
			else if(c>='a' &&c<='z') {
				c=(char)(c-32);
			}
			System.out.print(c);
		}
	}

}
