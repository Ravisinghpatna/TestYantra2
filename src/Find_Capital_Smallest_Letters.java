
public class Find_Capital_Smallest_Letters {

	public static void main(String[] args) {
		
		String str = "RaviSinghPatna027@gmail.com";
		int cc=0,sc=0,nc=0,spe=0;
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(str.charAt(i)>='A' && str.charAt(i)<='Z')
			{
				 cc++;
			}
			else if(ch>='a'&& ch<='z')
			{
				sc++;
			}
			else if(ch>='0' && ch<='9')
			{
				nc++;
			}
			
			else
				spe++;
		}
		System.out.println("Capital----"+cc);
		System.out.println("small------"+sc);
		System.out.println("Number-----"+nc);
		System.out.println("special----"+spe);
		
	}

}
