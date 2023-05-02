package greatLearning;

public class Vechile_1 {
	int cost=0;
	int mileage=0;

	//	public void getCar()
	//	{
	//		System.out.println("Vechile Details");
	//		System.out.println("Vechile fuel cost "+fuel);
	//		System.out.println("Vechile mileage Details "+mileage);
	//	}
	public Vechile_1(int cost,int mileage)
	{
		this.cost=cost;
		this.mileage=mileage;
	}
	public void showVechileDetails()
	{
		System.out.println("This is a vechile");
		System.out.println("the cost of fuel is "+cost);
		System.out.println("the mileage of car is "+mileage);
	}
}
