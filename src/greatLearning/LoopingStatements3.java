package greatLearning;

public class LoopingStatements3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=5,b=-4,c=1;
		while(c<=10)
		{
			c=c+4;
			b=b+(2*a);
			System.out.print(b);
			
			while(b<=15) {
				System.out.print(b-5);
				b=b+7;
			}
		}
	}

}
