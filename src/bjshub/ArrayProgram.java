package bjshub;

import java.util.Scanner;

public class ArrayProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the size of an arrays");
//		int size=sc.nextInt();
		int []arr1= {1,2,0,1,0,2};

		int out0=0, out1=0,out2=0;

		for(int i=0; i<arr1.length; i++)
		{	
			if(arr1[i]==1) {
				System.out.print(arr1[i]+" ");
			}
		}
		for(int i=0; i<arr1.length; i++)
		{	
			if(arr1[i]==0)
			{System.out.print(arr1[i]+" ");
				
			}
		}
		for(int i=0; i<arr1.length; i++)
		{	
			if(arr1[i]==2)
			{
				System.out.print(arr1[i]+" ");
			}
		}
		
	}
}

