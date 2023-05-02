package Demo;

public class StringPalindrome {

	public static void main(String[] args) {
		String str = "radar";//level 
		String s1="";
		
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			s1=ch+s1;
		}
		
		if(s1.equals(str))
		{
			System.out.println("palindrome");
		}
		else
			System.out.println("not Palin ");
	}

}
