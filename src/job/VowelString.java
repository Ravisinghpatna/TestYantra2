package job;

public class VowelString {

	public static void main(String[] args) {

		String str = "iT is a vowel";
		int vowel=0;
		
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				vowel++;
			}
		}
		System.out.println("there are "+vowel+" vowels");
	}

}
