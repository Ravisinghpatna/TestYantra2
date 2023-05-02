package Demo;

import java.util.Scanner;

public class AddOneByOneNum {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Array size");
		int size=s.nextInt();
		int arr[]= new int [size];
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
			sum=sum+arr[i];
		
		}
		System.out.println(sum);
	}

}
