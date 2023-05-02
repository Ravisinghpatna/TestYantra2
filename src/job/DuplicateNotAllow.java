package job;

import java.util.HashSet;
import java.util.Scanner;

public class DuplicateNotAllow {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The String");
		String s1=sc.nextLine();
		s1=s1.toLowerCase();
		
		HashSet<Character> characterSet=new HashSet<>();
		
		for(char c:s1.toCharArray())
		{
			if(characterSet.contains(c))
			{
				System.out.print(c+" ");
			}
			else
			{
				characterSet.add(c);
			}
			
		}
	}
}
