package bjshub;

public class HowManySpecialCharacterArePresentsIntoTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Ravisingh17+-+";
		int cou=0;

		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
				
			if(!(ch>='A' && ch<='Z' ||ch>='a' && ch<='z' || ch>='0' && ch<='9'))
			{
				cou++;
			}
		}
		System.out.print(cou);
	}

}
