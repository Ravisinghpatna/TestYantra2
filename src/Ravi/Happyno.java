package Ravi;

public class Happyno {

	public static void main(String[] args) {
		int n=27;
		while(n>=10)
		{
			int sum=0;
			while(n>0)
			{
				int b=n%10;
				sum=sum+b*b;
				n=n/10;
				
			}
			n=sum;
		}
		if(n==1||n==7)
			System.out.println("Happy");
		else
			System.out.println("sad");
		
	}

}
