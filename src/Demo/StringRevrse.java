package Demo;

public
class StringRevrse {

	public static void main(String[] args) {
		String str = "btm";
		String s = "";

		for (int i = 0; i < str.length(); i++) {

			// s=str.charAt(i)+s;

			char ch = str.charAt(i);

			s = ch + s;
		}
		System.out.println(s);
	}

}
