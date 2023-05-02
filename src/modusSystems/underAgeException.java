package modusSystems;

public class underAgeException  extends Exception{
	public underAgeException() {
		System.out.println("you are not eligible");
	}
	public underAgeException(String massage) {
		super(massage);
	}
}

