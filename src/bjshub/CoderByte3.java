package bjshub;

public class CoderByte3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		String name="I love dogs";
		String[] ar = name.split(" ");
		String output="";

		for(int i=0;i<ar.length;i++)
		{
			output=output+ar[1].charAt(i) +ar[1].charAt(i);
		}
		output=output+ar;

		System.out.println(output);

		char allchar[]=output.toCharArray();

		for(int i=0;i<allchar.length;i++)
		{
			if(((i+1)%4==0)) 
			{
				allchar[i]='-';
			}
		}
		System.out.println(allchar);
	}

}
