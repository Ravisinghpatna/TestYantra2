package signiwis;

public class InAStringAddOnlyDigit {

	public static void main(String[] args) {
		String s="Ravi 02singh27";
		int sum=0;
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9')
			{
				sum=sum+(ch-48);
			}
		}
		System.out.println(sum);
	}

}
