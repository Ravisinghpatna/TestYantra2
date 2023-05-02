package modusSystems;

public class Stringpalindrome {
public static void main(String[] args) {
	String s="malayalam";
	char c[]=s.toCharArray();
	String save="";
	
	for(int i=0;i<c.length;i++) {
		save=c[i]+save;
	}
//	for(int i=c.length-1;i>=0;i--) {
//		save=save+c[i];
//	}
	

	if(s.equals(save)) {
		System.out.println("Srring Palindrome");
	}
	else {
		System.out.println("  Not palindrome");
	}
}
}
