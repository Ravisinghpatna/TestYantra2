package greatLearning;

public class LoopingStatements2 {
public static void main(String[] args) {
	int j=5,k=4,l=3,x=10;
	while(x<=13)
	{
		x=x+1;
		j=j+3;
		System.out.print(j+3);
		while(j<=16)
		{
			System.out.print("*");
			j=j+2;
		}
	}
}
}
