package Ravi;

import java.util.ArrayList;

public class Mysub {

	public static void main(String[] args) {
		String [] sr= {"TOI","Hindu","ET","BM","HT"};

		double []d= {26,20.5,34,10.5,18};
		ArrayList a=new ArrayList();
		
		int b=40;

		for(int i=0;i<sr.length;i++)
		{
			for(int j=i+1;j<sr.length;j++)
			{
				if(d[i]+d[j]<b)
				{
					a.add(sr[i]+" "+sr[j]);
				}
			}
		}
		System.out.println(a);
	}

}
