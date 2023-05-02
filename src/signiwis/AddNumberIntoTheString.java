package signiwis;

public class AddNumberIntoTheString {

	public static void main(String[] args) {
		String name="Ravi19 singh93";
		int add=0;	
		
		for(int i=0;i<name.length();i++)
		{
			char c=name.charAt(i);
			if(c>='0'&& c<='9')
			add=add+(c-48);
		}
		System.out.println(add);
//
//		for(int i=0;i<name.length();i++)
//		{
//			char c=name.charAt(i);
//
//			if(Character.isDigit(c))
//			{
//				add=add+Character.getNumericValue(c);
//			}
//		}
//		
//		System.out.println("Addition of given number into the String is = "+add);


		
//		
//		for(int i=0;i<name.length();i++) {
//			if(Character.isDigit(name.charAt(i)))
//				add=add+Integer.parseInt(name.substring(i,i+1));
//				
//		}
//		System.out.println(add);

	}

}
