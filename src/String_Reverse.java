
public class String_Reverse {

	public static void main(String[] args) {
		String str = "Qspiders";
		char[] s = str.toCharArray();
		String st = "";
		
		
		for(int i=0;i<s.length;i++)
		{
			st=s[i]+st;
		}
		System.out.println(st);
	}

}
