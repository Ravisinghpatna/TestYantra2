package modusSystemsPattern;

public class p10 {
	public static void main(String[] args) {
		int n=5;

		for(int i=1;i<=n;i++) {
			int x=i;
			for(int j=1;j<=n;j++) {
				System.out.print(x%2);
				x++;
			}
			System.out.println();
		}
	}
}
