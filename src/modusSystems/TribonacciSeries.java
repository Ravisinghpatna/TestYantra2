package modusSystems;

public class TribonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;
		int a=0,b=1,c=2,d;
		for(int i=1;i<=n;i++) {
			System.out.print(a+" ");
			d=a+b+c;
			a=b;
			b=c;
			c=d;
		}
	}

}
