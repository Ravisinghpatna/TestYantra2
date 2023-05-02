package modusSystemsPattern;

public class p18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int x=1;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++)
			{
				System.out.print(x++%2);
			}
			System.out.println();
		}

	}

}
