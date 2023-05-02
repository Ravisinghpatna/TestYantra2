package job;

public class PalindromeNum {

	public static void main(String[] args) {
		int n=1232, num=n;
		int sum=0;
		while(n!=0)
		{
			int b=n%10;
			sum=sum*10+b;
			n=n/10;
		}
		
		if(sum==num)
		{
			System.out.println("palind");
		}
		else
			System.out.println("not palid");
	}

}
