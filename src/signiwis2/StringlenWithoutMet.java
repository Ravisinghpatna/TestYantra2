package signiwis2;
import java.util.Scanner;
public class StringlenWithoutMet {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String name=s.nextLine();
		int leng=0;

		char ch[]=name.toCharArray();//{'r','a','v','i',' ','s','i','n','g','h'}

		for(int i=0;i<ch.length;i++)
		{
			//char c=ch[i];
			if(ch[i]!=' ')
			{
				leng++;	
			}

		}
		System.out.println(leng);
	}

}
