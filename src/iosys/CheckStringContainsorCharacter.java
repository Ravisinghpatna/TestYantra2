package iosys;

public class CheckStringContainsorCharacter {

	public static void main(String[] args) {
		// TODO
		String s1="Raghu27";
		int character=0, num=0;
		
		char []ch=s1.toCharArray();
		for(int i=0;i<ch.length;i++) {

			if(ch[i]>='0'&& ch[i]<='9') {
				num++;
			}
			else if(ch[i]>='A' && ch[i]<='Z' || ch[i]>='a' && ch[i]<='z') {
				character++;
			}

		}
		System.out.println("Charater present in the string is :"+character);
		System.out.println("digit present in the string is "+num);

	}
}
