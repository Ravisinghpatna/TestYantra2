package bjshub;

public class CoderByte {

	public static void main(String[] args) {

		String s1="aaa*bbb";
		String challengeToken = "hvnoufe240";

		String ar[] = s1.split("\\*");
		String output="";

		for(int i=0;i<ar[0].length();i++)
		{
			output=output+ar[0].charAt(i)+ar[1].charAt(i);
		}
		//		System.out.println(output);
		output=output.concat(challengeToken);

		char allchar[]=output.toCharArray();
		//System.out.println(allchar);//abababhvnoufe240

		for(int i=0;i<allchar.length;i++)
		{
			if((i+1)%4==0) 
			{
				allchar[i]='_';
			}
		}
		
		//		String finaloutput = new String(allchar);
		//		System.out.println(finaloutput);
		
		System.out.println(allchar);
	}
}
