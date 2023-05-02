
public class Strongno {

	public static void main(String[] args) {
		int n=145;
		int numb=n,sum=0;

		while(n>0)
		{
			int x=n%10;
			int fact=1;
			for(int i=1;i<=x;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		if(numb==sum)
		{
			System.out.println("Strong");
		}
		else
			System.out.println("Not strong");


	}

}
