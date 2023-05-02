package signiwis;

public class Santosh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1234567;
		int even=0,odd=0;

		while(num!=0)
		{
			int x=num%10;
			if(x%2==0)
			{
				even=even+x;
			}
			else {
				odd=odd+x;
			}
			num=num/10;
		}

		System.out.println("Sum of even no is = "+even);
		System.out.println("Sum of odd no is = "+odd);
		System.out.println("Difference of even and odd is "+(even-odd));
	}

}
