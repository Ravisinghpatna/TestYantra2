package signiwis2;

import java.util.Scanner;

public class FindLengthWithoutUsingMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String Name");
		String st = sc.nextLine();
		int len = getStringLength(st);
		System.out.println(len);
	}
	public static int getStringLength(String st) {
		int count = 0;
		for (int i = 0; i < st.length(); i++) {
		
			count++;
		}
		return count;
	}
}
