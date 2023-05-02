package Ravi;

public class StrongNo {

	public static void main(String[] args) {
		int n=145,temp=n,sum=0;

		while(n>0)
		{
			int fact=1;
			int b=n%10;
			for(int i=1;i<=b;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		if(sum==temp)
		{
			System.out.println("Strong no");
		}
		else
			System.out.println("no ");
	}

}
