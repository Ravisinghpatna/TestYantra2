package signiwis;
import java.util.Scanner;
public class AddNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int array=sc.nextInt();
		
		int num[]=new int [array];
		int add=0;
		
		System.out.println("enter the number");
		
		for(int i=0;i<num.length;i++)
		{
			int input=sc.nextInt();
			add=add+input;
		}
		System.out.println("Addition of number :"+add);
	}

}
