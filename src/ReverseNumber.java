
public class ReverseNumber {

	public static void main(String[] args) {
		int n=12345678;
		
		int sum=0;
		while(n!=0)
		{
			int b=n%10;
			sum=sum*10+b;
			n=n/10;
			
		}
		System.out.println(sum);
	}

}
