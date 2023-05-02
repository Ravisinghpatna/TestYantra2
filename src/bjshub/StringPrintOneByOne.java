package bjshub;
public class StringPrintOneByOne {
	public static void main(String[] args) {
		String s1="Ravi";
		String add="";
		//char s2[]=s1.toCharArray();
		for(int i=0;i<s1.length();i++)
		{
			char s2=s1.charAt(i);
		add=add+s2;
		System.out.println(add);
		}

	}
}
