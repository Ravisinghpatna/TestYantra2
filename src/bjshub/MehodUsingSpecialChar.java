package bjshub;

public class MehodUsingSpecialChar {

	public static int specialChar(String name)
	{
		int count1=0;
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			if((ch>='A' && ch<='Z' || ch>='a' && ch<='z' || ch>='0' && ch<='9')==false)
			{
				count1++;
			}
		}
		return count1;
	}

	public static void main(String[] args) {
		//MehodUsingSpecialChar m=new MehodUsingSpecialChar();
		String name="Ravi_++_+_!@!@";
		int ravi=specialChar(name);
		System.out.println(ravi);
	}

}
