package modusSystemsPattern;

public class eExceptionHAndling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		try {
			int n=a/0;
			System.out.println(n);
		}
		catch(Exception e) {
			System.out.println("Exception Handled");
		}
		finally {
			System.out.println("thank you for visiting");
		}
		
	}

}
