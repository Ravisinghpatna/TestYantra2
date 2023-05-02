package Demo;
public class Small_Capi {
	public static void main(String[] args) {
		String str="RAVI Singh";
		int countc = 0,counts=0;

		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch!=' ') {
				

				if(ch>='A' && ch<='Z')
				{
					countc++;
				}
				
				else//else if(ch>='a'&& ch<='z')

				{
					counts++;
				}
			}
		}
		System.out.println("capit---"+countc);
		System.out.println("smal----"+counts);
	}

}
