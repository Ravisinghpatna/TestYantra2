
public class Panagram {

	public static void main(String[] args) {

		String s1="The quick Brown fox jumps Over the lazy dog";
		s1=s1.toLowerCase();

		boolean value = isPalingram(s1);
		System.out.println(value);
	}

	public static boolean isPalingram(String s1)
	{
		if(s1.length()<26)
		{
			return false;
		}
		else
		{
			for(char c='a';c<=s1.length();c++)
			{
				if(s1.indexOf(c)<0)
				{
					return false;
				}

			}
		}
		return true;

	}

}

