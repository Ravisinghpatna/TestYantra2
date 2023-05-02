package signiwis;

import java.util.Scanner;

public class AddNo_Using_ScannerObject {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the size of Array");
		int size = sc.nextInt();
		int sumofArray=0;
		int sum=0;
		
		int []array=new int[size];
		System.out.println("enter the number");
		for(int i=0;i<array.length;i++)
		{
			sumofArray=sc.nextInt();
			sum=sum+sumofArray;
		}
		System.out.println(sum);
	}

}
