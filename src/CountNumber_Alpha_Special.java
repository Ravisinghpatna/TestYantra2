
public class CountNumber_Alpha_Special {

	public static void main(String[] args) {
		String st="Singh is back 027@gmail.com";
		int countNum=0,countAlpha=0,countSpecial=0;
		st=st.toLowerCase();


		for(int i=0;i<st.length();i++)
		{

			char ch=st.charAt(i);
			if(ch!=' ')
			{
				if(ch>='a'&& ch<='z')
				{
					countAlpha++;
				}
				else if(ch>='0' && ch<='9')
				{
					countNum++;
				}

				else
				{
					countSpecial++;
				}
			}
		}

		System.out.println("number----"+countNum);
		System.out.println("alpha-----"+countAlpha);
		System.out.println("special---"+countSpecial);
	}

}
