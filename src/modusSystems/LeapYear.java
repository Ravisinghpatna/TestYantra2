package modusSystems;

public class LeapYear {

	public static void main(String[] args) {
		int year=2024;
		if(year%100==0 && year%400==0 || year%100!=0 && year%4==0) {
			System.out.println("Leap year");
		}
		else {
			System.out.println("Not leap");
		}
	}

}
