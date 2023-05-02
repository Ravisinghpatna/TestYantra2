package iosys;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y=2028;
		if(y%4==0 && y%400==0 || y%4==0 && y%100!=0) {
			System.out.println("leap year");
		}
		else {
			System.out.println("not leap year");
		}
	}

}
