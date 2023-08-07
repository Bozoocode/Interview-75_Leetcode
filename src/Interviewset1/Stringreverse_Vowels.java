package Interviewset1;

public class Stringreverse_Vowels {
	public static String reversestringvowel(String str) {
		char[] ch=str.toCharArray();
		int pointer=0;
		int ender=str.length()-1;
		String Vowel="aeiouAEIOU";
		while(pointer<ender) {
			while(pointer<ender && Vowel.indexOf(ch[pointer])==-1) {
				pointer++;
				
			}
			while(pointer<ender && Vowel.indexOf(ch[pointer])==-1) {
				ender--;
			}
			char temp=ch[pointer];
			ch[pointer]=ch[ender];
			ch[ender]=temp;
			pointer++;
			ender--;
			
		}
		String answer=new String(ch);
		return answer ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="hello";
System.out.println(reversestringvowel(s));
	}

}
