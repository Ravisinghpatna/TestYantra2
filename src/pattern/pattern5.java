package pattern;

public class pattern5 {

	public static void main(String[] args) {

		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			int x=i;
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print(x);
				if(i>k)
				{
					x--;
				}
				else {
					x++;
				}
			}
			System.out.println();
		}
		
	}

}
