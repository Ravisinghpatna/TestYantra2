package modusSystems;

public class Integer_palindrome {
	public static void main(String[] args) {
		int n=123221;
		int temp=n;
		int save=0;

		while(n>0) {
			int x=n%10;
			save=save*10+x;
			n=n/10;
		}

		if(save==temp) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}
}
