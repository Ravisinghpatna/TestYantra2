package signiwis;

public class CountVowelConsonent {
	public static void main(String[] args) {
		String s="Belgaluru patna";
		//s=s.toLowerCase();
		int vowel=0, con=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='A' || c=='E'|| c=='I'|| c=='O'|| c=='U' 
					||c=='a' || c=='e'|| c=='i'|| c=='o'|| c=='u')
			{
				vowel++;
			}		
			else if(c>='A'&& c<='Z'|| c>='a'&& c<='z')
			{
				con++;
			}
		}
		System.out.println("vowel --"+vowel);
		System.out.println("consonent--"+con);
	}
}
