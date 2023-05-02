package Demo;

import java.util.Arrays;

public class Anagram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Jaar";
		String s2 = "raajj";


		s1=s1.toLowerCase();
		s2=s2.toLowerCase();

		char[]ch1=s1.toCharArray();
		char[]ch2=s2.toCharArray();

		if(ch1.length!=ch2.length)
		{
			System.out.println("it is NO ANAG");
			return;
		}
			for(int i=0;i<ch2.length;i++)
			{
				Arrays.sort(ch1);
				Arrays.sort(ch2);
			}
			
			boolean resul = Arrays.equals(ch1, ch2);
			
			if(resul)
			{
				System.out.println(s1+" "+s2+" "+"Anag");
			}
			else
				System.out.println(s1+" "+s2+" "+"not anag");
		
		
	}

}
