package job;

import java.util.Scanner;

public class SumOfNum_Array {

	public static void main(String[] args) {
	Scanner s=new Scanner (System.in);
	System.out.println("Enter the size of an Array");
	int num = s.nextInt();
	
int sum=0;
	int Array[]=new int [num];
	
	for(int i=0;i<Array.length;i++)
	{
		Array[i]=s.nextInt();
	}
	
	for(int i=0;i<Array.length;i++)
	{
		//12345
		sum=sum+Array[i];
	}
	
	System.out.println(sum);

	}

}
