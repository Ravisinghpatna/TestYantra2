package Ravi;

public class FindFirstWordAndLast {

	public static void main(String[] args) {
//		String name="ravi singh";
//		System.out.println(name.charAt(0));
//		System.out.println(name.charAt(name.length()-1));
//		
	
		String name="Ravi singh patna bihar";
		String word[]=name.split(" ");
		
			for(int i=0;i<word.length;i++)
			{
				char ch=word[i].charAt(i);
				System.out.print(ch+" ");
			}
		
	}

}
