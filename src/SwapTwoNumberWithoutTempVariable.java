
public class SwapTwoNumberWithoutTempVariable {

	public static void main(String[] args) {
		int x=20;
		int y=30;
		
//		x=x+y;//50
//		y=x-y;//20
//		x=x-y;//30
		
		x=x*y;//600
		y=x/y;//20
		x=x/y;//30
		
		System.out.println("x----"+x);
		System.out.println("y----"+y);

	}

}
