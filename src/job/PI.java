package job;

import java.util.Scanner;

public class PI {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number for radius: ");
			final double radius = sc.nextDouble();
			double pi=3.14;
			
			double area = pi*radius * radius ;
			System.out.println("The area for the circle of radius " +
			radius + " is " + area);
			

	}

}
