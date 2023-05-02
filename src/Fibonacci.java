
class Fibonacci {

	public static void main(String[] args) {
		int n=6, w=0,x=1,y=2,z;
		
		for(int i=1;i<=n;i++)
		{
			System.out.println(w);
			z=w+x+y;
			w=x;
			x=y;
			y=z;
		}
	}

}
