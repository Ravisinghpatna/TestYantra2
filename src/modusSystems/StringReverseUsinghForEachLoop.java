package modusSystems;

public class StringReverseUsinghForEachLoop {
	public static void main(String[] args) {
		String s="Ravi singh";
		String rev="";
		char[] array = s.toCharArray();

		for(char c:array) {
			rev=c+rev;
		}
		System.out.println(rev);
	}
}
