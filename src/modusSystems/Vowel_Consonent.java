package modusSystems;

public class Vowel_Consonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="modus systems";
		int vowel=0,consonent=0;

		for(int i=0;i<name.length();i++) {
			char c=name.charAt(i);
			if(c=='A'|| c=='E'|| c=='I'||c=='O'||c=='U' || c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
				vowel++;
			}
			else if(c>='A' && c<='Z' || c>='a' && c<='z') {
				consonent++;
			}
		}
		System.out.println("vewel = "+vowel);
		System.out.println("Consonents = "+consonent);
	}

}
