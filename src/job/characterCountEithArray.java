package job;

public class characterCountEithArray {

	public static void main(String[] args) {

		String s1 = "Ravi singh patna";
		int aa[]=new int [127];
		for(int i=0;i<s1.length();i++)
		{
			char c = s1.charAt(i);
			aa[c]++;
		}
		for(int i=0;i<aa.length;i++)
		{
			if(aa[i]>0)
			{
				System.out.println((char)(i)+"--- "+aa[i]);
			}
		}

	}

}
