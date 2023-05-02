package job;

public class Print1to100WithoutAnyLoop {


	public static void main(String[] args) 
	{
		int number=1;
		//loop(number);
		Print1to100WithoutAnyLoop ob=new Print1to100WithoutAnyLoop();

		ob.loop(number);
	}
	public void loop(int numb)
	//public static void loop(int number)
	{

		if(numb<=10)
		{
			System.out.println(numb);
			loop(numb+1);
		}
	}
	
}


