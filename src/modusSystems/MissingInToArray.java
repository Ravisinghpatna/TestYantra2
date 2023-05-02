package modusSystems;

import java.util.Scanner;

public class MissingInToArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the row");
		int row = s.nextInt();
		System.out.println("Enter the column");
		int column = s.nextInt();

		System.out.println("Enter the value of row and column");
		int array[][] = new int[row][column];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				array[i][j] = s.nextInt();
			}
		}
		System.out.println("Enter the number for check missing?");
		boolean flag = false;
		int find = s.nextInt();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (array[i][j] == find) {
					flag = true;
				}
			}
		}
		if (flag) {
			System.out.println("Number is present");
		} else {
			System.out.println("Number is Missing");
		}
	}

}
