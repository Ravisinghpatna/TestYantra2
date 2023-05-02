package greatLearning;

import java.util.Scanner;

public class Students {
	Scanner sc=new Scanner(System.in);
	String name="";
	int marks=0;

	//	public void getDetails()
	//	{
	//		System.out.println("Enter the name");
	//		name=sc.nextLine();
	//		System.out.println("Enter the number");
	//		no=sc.nextInt();
	//		
	//		System.out.println("");
	//	}

	public Students(String n, int m)
	{
		name=n;
		marks=m;
	}
	public void showDetails()
	{
		System.out.println(name);
		System.out.println(marks);
	}
	// TODO Auto-generated method stub

}


