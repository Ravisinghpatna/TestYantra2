package Demo;

public class ArrayEx {

	public static void main(String[] args) {
		//		
		int ar[]= {27,02,19,2,43, 565, 88,1};
		int small=ar[0];

		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<small)
			{
				small=ar[i];
			}
		}
		System.out.println(small);
	}

}
