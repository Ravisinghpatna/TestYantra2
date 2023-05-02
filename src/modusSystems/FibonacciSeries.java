package modusSystems;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=8;
		int a=0,b=1,c;
		for(int i=1;i<=n;i++) {
			System.out.print(a);
			c=a+b;
			a=b;
			b=c;
		}
	}

}
