import java.util.LinkedHashSet;

public class RemoveDuplicateCharFromString {
public static void main(String[] args) {
	String str = "ravi singh";
	LinkedHashSet lh=new LinkedHashSet();
	for(int i=0; i<str.length(); i++)
	{
		char ch = str.charAt(i);
		lh.add(ch);
	}
	
//	System.out.println(lh);
	
	String s="";
	
	for(Object ravi:lh)
	{
		s=s+ravi;
	}
	System.out.print(s);
}
}
