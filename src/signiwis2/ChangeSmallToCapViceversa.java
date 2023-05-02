package signiwis2;

public class ChangeSmallToCapViceversa {

	public static void main(String[] args) {
		String st="RavI Singh";
	//	char[] ch=st.toCharArray();
		String obj = "";

		for(int i=0;i<st.length();i++)	
		{
			char ch=st.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				obj=obj+(char)(ch+32);
			}
			else if(ch>='a'&& ch<='z')
			{
				obj=obj+(char)(ch-32);
			}
		}

		System.out.print(obj);
	}

}
