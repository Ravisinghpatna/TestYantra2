package Ravi;

public class StringPrint_LineByline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st="Ravi";
		//System.out.print(st);
		char c[]=st.toCharArray();
		
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(c[j]);
			}
			System.out.println();
		}
	}

}
