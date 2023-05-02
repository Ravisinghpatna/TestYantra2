package Ravi;

public class NumberPatternUnique {
	public static void main(String[] args) {


	int n=5;
	for(int i=1;i<=n;i++)
	{
		int b=i;
		for(int j=1;j<=i;j++)
		{
			System.out.print(b+" ");
			b=b+n-j;
		}
		System.out.println();
	}
}
}