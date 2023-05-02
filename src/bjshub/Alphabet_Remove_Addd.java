package bjshub;

import java.util.Scanner;

public class Alphabet_Remove_Addd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1="sand";

		System.out.println("Enter the first Letter");
		String name=sc.next();

		for(int i=1; i<s1.length(); i++) {
			name=name+s1.charAt(i);

		}
		System.out.println(name.toUpperCase());
	}
}
