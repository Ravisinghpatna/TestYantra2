
public class ReverseNumberForLoop {

	public static void main(String[] args) {

		
		int revv=0;
		for(int n=12345;n>0;n=n/10)
		{
			revv=revv*10+n%10;
		}

			System.out.println(revv);
		
	}
}
