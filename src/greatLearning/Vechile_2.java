package greatLearning;

public class Vechile_2 extends Vechile_1{
	String color="";
	int tyre=0;

	public Vechile_2(int cost, int mileage, String color, int tyre)
	{
		super(cost, mileage);
		this.color=color;
		this.tyre=tyre;
	}
	public void showCarDetails()
	{
		System.out.println("This is car");
		System.out.println("The color of car is "+color);
		System.out.println("The numberso of tyre are "+tyre);
	}
}
