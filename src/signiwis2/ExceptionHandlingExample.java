package signiwis2;
import java.util.Scanner;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Enter a number: ");
			int num1 = scanner.nextInt();
			System.out.print("Enter another number: ");
			int num2 = scanner.nextInt();
			int result = num1 / num2;
			System.out.println("Result: " + result);
		} 
		catch (ArithmeticException e) {
			System.out.println("Error: Division by zero.");
		} 
		catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		} 
		finally {
			scanner.close();
		}
		
		//WITHOUT SCANNER
		
		int n1=10;
		int n2=0;
		try {
			int result=n1/n2;
			System.out.println(result);
		}
		catch(ArithmeticException e) {
			System.out.println("Error catch ");
		}
	
			finally {
				System.out.println("close");
			}
	}
}
