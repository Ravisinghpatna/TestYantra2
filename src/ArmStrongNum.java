
public class ArmStrongNum {

	//1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407.1634, 8208, 9474, 54748, 92727, 93084, 548834, 1741725, 4210818, 9800817, 9926315, 24678050, 24678051, 88593477, 146511208, 472335975, 534494836, 912985153, 4679307774, 32164049650, 32164049651.
	public static void main(String[] args) {
		int n=153,temp=n,count=0;//1634 153
		int sum=0;

		while(n>0)
		{
			count++;
			n=n/10;
		}
		n=temp;
		
		
		while(n>0)
		{
			int fact=1;
			int b=n%10;

			for(int i=1;i<=count;i++)
			{
				fact=fact*b;
			}
			sum=sum+fact;    //1643.......1+1296+265+81=====1643
			n=n/10;

		}

		if(temp==sum)
		{
			System.out.println("ArmStrongno");
		}
		else
			System.out.println("not armStrong");

	}

}
