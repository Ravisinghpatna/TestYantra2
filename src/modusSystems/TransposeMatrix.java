package modusSystems;
import java.util.Scanner;

public class TransposeMatrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row");
		int row=sc.nextInt();

		System.out.println("enter the column");
		int column=sc.nextInt();

		int ar[][]=new int [row][column];

		System.out.println("enter the value of matrix");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {

				ar[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(ar[j][i]+" ");
			}
			System.out.println();
		}

	}

}
