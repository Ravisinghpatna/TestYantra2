package greatLearning;

public class LoopingStatements1{

	public static void main(String[] args) {
		int a=10,b=20,i=1,j=1;
		while(i<=5)
		{
			i=i+1;
			while(j<=5)
			{
				System.out.print(a+i+" ");
				j=j+1;
			}
		}
	}

}
