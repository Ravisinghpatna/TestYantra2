package Ravi;

public class Palindrome {

	public static void main(String[] args) {

		int n=13331,temp=n;
		int sum=0;
		
		while(n>0)
		{
			int b=n%10;
			sum=sum*10+b;
			n=n/10;
		}		
		if(sum==temp)
		{
			System.out.println("palindrome");
		}
		else
			System.out.println("no palindrome");
	}

}
