package modusSystems;

public class StrongNumber {
	public static void main(String[] args) {
		int n=135, tem=n; int sum=0;

		while(n>0) {
			int x=n%10;
			int fact=1;
			for(int i=1;i<=x;i++) {
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		if(sum==tem) {
			System.out.println("Strong Num");
		}
		else {
			System.out.println("Not strong Num");
		}
	}
}
