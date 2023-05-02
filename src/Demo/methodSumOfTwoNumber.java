package Demo;

public class methodSumOfTwoNumber {
	public static int addToNum(int a,int b)
	{
		System.out.println("sum of two number ");
		
		int product = a*b;
		return product;
	}
	public static void main(String[] args) {
			
		int product= addToNum(20,10);
		System.out.println(product);
		
	}

}
