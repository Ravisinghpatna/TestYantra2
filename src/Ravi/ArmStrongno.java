package Ravi;

public class ArmStrongno {

	public static void main(String[] args) {
		int n=153, temp=n,count=0,sum=0;

		while(n>0)
		{
			count++;
			n=n/10;
		}
		n=temp;
		while(n>0)
		{
			int b=n%10;
			int fact=1;
			for(int i=1;i<=count;i++)
			{
				fact=fact*b;
			}
			sum=sum+fact;
			n=n/10;
		}
		if(sum==temp)
		{
			System.out.println("Armstrong no");
		}
		else
			System.out.println("no armstrongno");

	}

}
