package pattern;

public class pattern1 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(" ");
			}
			for(int r=i;r<=n;r++)
			{
				System.out.print(r);
			}
			System.out.println();
		}
		

	}

}
