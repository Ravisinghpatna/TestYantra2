
public class StringS1 {

	public static void main(String[] args) {
		
		String st = "jspiders";
		String[] s1 = st.split("");
		String s="";
		
		for(int i=0;i<s1.length;i++)
		{
			s=s1[i]+s;
		}
		System.out.print(s);

	}

}
