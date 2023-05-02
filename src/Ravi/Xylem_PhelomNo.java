package Ravi;

public class Xylem_PhelomNo {

	public static void main(String[] args) {
		int n=11134;
		int sum1=n%10,sum2=0;
		n=n/10;
		
		while(n>=10)
		{
			int b=n%10;
			sum2=sum2+b;
			n=n/10;
		}
		sum1=sum1+n;
		
		if(sum1==sum2)
		{
			System.out.println("xylem");
				
		}
		else
		{
			System.out.println("Phloem");
		}
	
	}

}
