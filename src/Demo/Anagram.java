package Demo;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s = "ravi";
		String s2 = "virur";
		//		
				char[] ch = s.toCharArray();
				char[] ch2 = s2.toCharArray();
				
		if(s.length()!=s2.length())
		{
			System.out.println("not anagraammm");
			return;
		}
		
			Arrays.sort(ch);
			Arrays.sort(ch2);
		

			boolean result = Arrays.equals(ch, ch2);
		

			if(result)
			{
				System.out.println("anagram");
			}
			else
				System.out.println("Not anagram");
		}

}
