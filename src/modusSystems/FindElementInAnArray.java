package modusSystems;

import java.util.Scanner;

public class FindElementInAnArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row-----");
		int row=sc.nextInt();

		System.out.println("Enter the column----");
		int column=sc.nextInt();

		int arr[][]=new int [row][column];

		System.out.println("enter the Matrix");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("enter the num for Search");
		int find=sc.nextInt();
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				if(arr[i][j]==find) {
					System.out.println("b is found ==="+i+j);
				}
			}
		}
	}
}
