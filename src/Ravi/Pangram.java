package Ravi;

public class Pangram {

	public static void main(String[] args) {

	String	s="The quick brown fox jumps over the lazy dog";	
	//String s="pack my box with fiv dozen liquor jugs";
	System.out.println(isPangram(s));
	
	}

	
	public static boolean isPangram(String s)
	{
		if(s.length()<26)
		{
			return false;
		}
		else
		{
			for(char ch='a';ch<='z';ch++)
			{
				if(s.indexOf(ch)<0)
				{
					return false;
				}
			}
		}
		return true;
		
		
	}
}
