package modusSystems;

public class exceptionMain extends underAgeException{
public static void main(String[] args) {
	int age=18;
	try {
		if(age<18) {
			throw new underAgeException("you are not eligible 4 Voting");
			
		}
		else {
			System.out.println("you are eligile for vote");
		}
	}
	catch(underAgeException e) {
		System.out.println(e);
	}
	
}
}
