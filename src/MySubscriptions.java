import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class MySubscriptions {

	public static void main(String[] args) {

		String	s1[]= {"TOI","Hindu","ET","BM","HT"};
		double d[]= {26,20.5,34,10.5,18};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input");   
		double cost = sc.nextDouble();

		ArrayList ob=new ArrayList();
		// LinkedList ob=new LinkedList<>();
		//Vector ob=new Vector<>();


		for(int i=0;i<s1.length;i++)
		{
			for(int j=i+1;j<s1.length;j++)
			{
				if(d[i]+d[j]<cost)
				{
					ob.add("{"+s1[i]+" "+s1[j]+"}");
					//System.out.print("{"+s1[i]+","+s1[j]+"}");
				}

			}
		}
		System.out.println(ob);
	}

}
