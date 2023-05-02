package Demo;

public class OccurrenceOfACharacter {

	public static void main(String[] args) {
		String str="abCAbcABCb";
		int	a=0,c=0,b=0;

		str=str.toLowerCase();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);

			if(ch=='a')
			{
				a++;
			}
			else if(ch=='b')
			{
				b++;
			}
			else
			{
				c++;
			}
		}
		
		System.out.println("a----"+a);
		System.out.println("b----"+b);
		System.out.println("c----"+c);
	}
	

}
