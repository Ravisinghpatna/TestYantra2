package iosys;

public class CountInterger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=12345;
		int	count=0;
		
		while(number>0) {
			int x=number%10;
			count++;
			number=number/10;
		}
		System.out.println("count of number is :"+count);
	}

}
