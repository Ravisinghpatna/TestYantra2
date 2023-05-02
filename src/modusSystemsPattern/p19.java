package modusSystemsPattern;

public class p19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++) {
			int x=i;
			for(int j=1;j<=i;j++) {
				System.out.print(x );
				x=x+n-j;
			}
			System.out.println();
		}
	}

}
