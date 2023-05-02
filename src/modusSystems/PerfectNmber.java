package modusSystems;

public class PerfectNmber {

	public static void main(String[] args) {
		int n=28;
		int count=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				count= count+i;
			}
		}
		if(n==count) {
			System.out.println("prime");
		}
		else {
			System.out.println("not Prime");
		}
		
	}

}
