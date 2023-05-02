package Ravi;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {


		String s = "caa";
		String s1 = "race";

		char[]ch=s.toCharArray();
		char []ch1=s1.toCharArray();

		if(ch.length!=ch1.length)
		{
			System.out.println("not anagra");
			return;
		}	
		
			Arrays.sort(ch1);
			Arrays.sort(ch);
			
		boolean	resul=Arrays.equals(ch, ch1);

		if(resul)
			System.out.println("Anagra");
		else
			System.out.println("not anagra");


	}

}
