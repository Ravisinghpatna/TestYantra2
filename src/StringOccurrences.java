
public class StringOccurrences {

	public static void main(String[] args) {

		String str = "jsva";

		int c1 = 0, c2 = 0, c3 = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'j')
		
			{
				c1++;
			}
			if (ch == 'a') {
				c2++;
			}
			if (ch == 'v') {
				c3++;
			}

		}
		System.out.println("j---" + c1);
		System.out.println("a---" + c2);
		System.out.println("v---" + c3);

	}

}
