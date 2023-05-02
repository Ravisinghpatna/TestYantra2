package Demo;

import java.util.Scanner;

public class MethodWithuserInput {
	public int addNum(int a,int b,int c)
	{
		System.out.println("Sum of two number ");
		//int sum=a+b+c;
		return a+b+c;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the three number ");
		int a = s.nextInt();
		int b = s.nextInt();
		int c=s.nextInt();
		
		MethodWithuserInput mwui=new MethodWithuserInput();
		
//		int num = mwui.addNum(a, b, c);
//		System.out.println(num);
		
		System.out.println(mwui.addNum(a, b, c));
	
	}


}
