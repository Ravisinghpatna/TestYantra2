package modusSystemsPattern;

public class p11 {

	public static void main(String[] args) {
		int n=5;
		int b=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(b++);
			
				if(b>9) {
					b=1;
				}

			}
			System.out.println();
		}
	}

}
