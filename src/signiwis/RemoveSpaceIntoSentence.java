package signiwis;

public class RemoveSpaceIntoSentence {

	public static void main(String[] args)
	{
	String s1="This is a Sentence";
	String []s2=s1.split(" ");
	String s3="";
	
	for(int i=0;i<s2.length;i++)
	{
		s3=s3+s2[i];
	}
	System.out.println(s3);
	//System.out.println(s3.replaceAll("\\s", ""));
	}

}

