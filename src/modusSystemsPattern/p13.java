package modusSystemsPattern;

public class p13 {
public static void main(String[] args) {
	int n=5;
	for(int i=1;i<=n;i++) {
		for(int j=i;j<=n;j++) {
			System.out.print((char)(64+j));
		}
		System.out.println();
	}
	
}
}
