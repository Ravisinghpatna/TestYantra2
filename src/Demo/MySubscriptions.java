package Demo;

import java.util.ArrayList;
import java.util.Scanner;

public class MySubscriptions {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE INPUT");
		double cost =sc.nextDouble();
		
		 String s1[]= {"ToI","Hindu","ET","BM","HT"};
		 double []du= {26,20.5,34,10.5,18};
		 
		
		 
		 ArrayList al=new ArrayList<>();
		 
		 for(int i=0;i<s1.length;i++)
		 {
			 for(int j=i+1;j<s1.length;j++)
			 {
				if(du[i]+du[j] <cost)
				{
					al.add(s1[i]+" "+s1[j]);
					//System.out.println(s1[i]+" "+s1[j]);
				}
			 }
		 }
		 System.out.println(al);
	}

}
