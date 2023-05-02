package job;

public class ReverseString {

	public static void main(String[] args) {
		String s1="Tcs is a multinational brand";
		String rev="";
		//charAt
//		for(int i=0;i<s1.length();i++)
//		{
//			char ch=s1.charAt(i);
//			
//			rev=ch+rev;
//		}
			//tocharArray
		char[] ch = s1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			rev=ch[i]+rev;
		}
		System.out.println(rev);
	}

}
