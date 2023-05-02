package Ravi;

public class String_Vowel_present {
	public static void main(String[] args) {
		String str = "This is the paragraph";
		str=str.toLowerCase();

		int vowel=0,consonant=0;

		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				vowel++;
			}
			else if(ch>='a'&& ch<='z')
			{
				consonant++;
			}
		}
		System.out.println(vowel);
		System.out.println(consonant);
	}

}