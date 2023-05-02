package signiwis;

public class demo {
public static void main(String[] args) {
	String str = "Ravi27singh02";
	int sum = 0;
	for (int i = 0; i < str.length(); i++) {
	    char c = str.charAt(i);
//	    if (Character.isDigit(c)) {
//	        sum =sum+ Character.getNumericValue(c);
//	    } 
	    if(c>='0'&& c<='9')
	    {
	    	sum=sum+(c-48);
	    }
	}
	System.out.println("Sum of all numbers in the string: " + sum);

}
}
