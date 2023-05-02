package modusSystems;

import java.util.Scanner;

public class MissingArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the row");
	int row=sc.nextInt();
	System.out.println("enter the column");
	int column=sc.nextInt();
	
	int arr[][]=new int [row][column];
	
	System.out.println("enter the value of an array ");
	for(int i=0;i<row;i++) {
		for(int j=0;j<column;j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	
	System.out.println("enter find the number of an arrays");
	int finds=sc.nextInt();
	
	boolean flag=false;
	for(int i=0;i<row;i++) {
		for(int j=0;j<column;j++) {
			if(arr[i][j]==finds) {
				flag=true;
				
			}
		}
	}
	if(flag) {
		System.out.println("The number is matching");
	}
	else {
		System.out.println("The number is missing");
	}
}
}
