package greatLearning;

import java.util.Scanner;

public class Teachers {
	public static void main(String[] args) {
//		Students s=new Students();
//		s.getDetails();
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the name");
		String name=sc.nextLine();
		
		System.out.println("enter the marks");
		int mark=sc.nextInt();
		
		Students s=new Students(name,mark);
		s.showDetails();

	}
}
