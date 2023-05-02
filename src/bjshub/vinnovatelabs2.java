package bjshub;

public class vinnovatelabs2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	String input="letters=A B Z T numbers=1 2 26 20 combine=true";
		String input="a=3 b=4 a=23 b=a 4 23 c=";
		String output="";
		String challengeToken="hvnnoufe240";

		int count=0;
		for(int i=input.length()-1;i>=0;i--)
		{
			if(input.charAt(i)!='=') {
				count++;
			}
			else {
				output="="+count+output;
				count=0;
				i--;

				for(int j=i;i>=0;i--)
				{
					if(input.charAt(i)!=' ') {
						count++;
					}
					else {
						output=" "+count+output;
						count=0;
						break;
					}
					if(i==0) {
						output=count+output;
						break;
					}
				}
			}

		}
		System.out.println(output);
		
		output=output.concat(challengeToken);
		System.out.println(output.length());
		StringBuilder finalOutput=new StringBuilder(output);

		for(int i=0;i<finalOutput.length();i++) {
			if((i+1)%4==0) {
				finalOutput.replace(i, i, challengeToken);
			}
		}
	}

}
