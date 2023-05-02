package signiwis;

import java.util.Scanner;

public class RemoveSpaceIntoTheSentence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Sentence");
		String name = sc.nextLine();
//		String name="    this oo cold";
		String sentenceadd="";
		
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			sentenceadd=sentenceadd+ch;
			
		}
		System.out.println(sentenceadd.replaceAll("\\s", ""));
	}

}
