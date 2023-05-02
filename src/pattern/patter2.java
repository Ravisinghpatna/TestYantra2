package pattern;

public class patter2 {
	public static void main(String[] args) {
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int r=i;r>=1;r--)
			{
				System.out.print(r);
			}
			System.out.println();
		}
	}

}
