package signiwis;

public class ReverseName {

	public static void main(String[] args) {
		String name="Ravi Singh";
		String [] sp=name.split(" ");
		String reverse="";

		for(String s: sp) {

			String rev="";

			for(int i=s.length()-1;i>=0;i--)
			{

				rev=rev+s.charAt(i);
			}
			reverse=reverse+rev+" ";

		}
		System.out.println(reverse);
	}

}
