
public class StringPalindrome {

	public static void main(String[] args) {
		String st = "racecar";//edivider, deified, civic, radar, level, rotor, kayak, reviver, racecar, madam, and refer.
		char[] s1 = st.toCharArray();
		String s2 = "";
		

		for (int i = 0; i < s1.length; i++) {
			s2 = s1[i] + s2;
		}
		
		if(s2.equals(st))
		{
			System.out.println(" Palindrome");
		}
		else
		{
			System.out.println("string not plalindrome");
		}
	}

}
