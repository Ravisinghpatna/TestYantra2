package bjshub;
import java.util.Scanner;
public class StringSubstring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the mainString ");
		String mainstr=sc.nextLine();//knowledge
		System.out.println("Enter the substring");
		String substr = sc.nextLine();//gift
		
		String space;
		
		space=mainstr.substring(0, 2)+substr+mainstr.substring(2);
		System.out.println(space);
		
		

	}

}
