package signiwis;

public class IPATTERN_ABABABA {
	public static void main(String[] args) {
		int n=7,row=3;

		for(int i=1;i<=row;i++){
			if(i==row/2+1) {
				for(int j=1;j<=n/2;j++) {
					System.out.print(" ");
				}
				System.out.print("b");
			}
			else {
				for(int j=1;j<=n;j++) {
					if((j+i)%2==0) {
						System.out.print("a");
					}
					else {
						System.out.print("b");
					}
				}
			}
			System.out.println();
		}
	}
}
