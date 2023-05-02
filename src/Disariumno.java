
public class Disariumno {

	public static void main(String[] args) {
		int n=135,temp=n,sum=0;
		int count=0;

		while(n>0)
		{
			count++;
			n=n/10;
		}
		n=temp;
		while(n>0)
		{
			int b=n%10;
			int res=1;
			for(int i=1;i<=count;i++)
			{
				res=res*b;
			}
			sum=sum+res;
			n=n/10;
			count--;
		}
		if(temp==sum)
		{
			System.out.println("Disarium");	
		}
		else
			System.out.println("no disarium");
		
	}

}
