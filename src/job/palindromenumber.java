package job;

public class palindromenumber {

	public static void main(String[] args) {
		int num=123454321,n=num,sum=0;
		
		while(num>0)
		{
			int b=num%10;
			sum=sum*10+b;
			num=num/10;
		}
		if(sum==n)
		{
			System.out.println("Palindrome");
		}
		else
			System.out.println("not Palindrome");
		

	}

}
