package greatLearning;

import java.util.Scanner;

public class VechileMainCalss {
	public static void main(String Raviraghu[]) {
		Scanner scan=new Scanner(System.in);

		System.out.println("Vechile cost");
		int vechileCost = scan.nextInt();

		System.out.println("Vechile mileage");
		int	vechileMileage=scan.nextInt();
		

		System.out.println("color of the Vechile");
		String vechileColor=scan.next();

		System.out.println("vechile tyres are ");
		int vechileTyre=scan.nextInt();

		Vechile_2 obj=new Vechile_2(vechileCost, vechileMileage, vechileColor, vechileTyre);
		obj.showCarDetails();
		System.out.println();
		obj.showVechileDetails();

	}
}
