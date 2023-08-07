package Interviewset1;

public class Mergestring_Alternative {
	public static String MergingString(String s1,String s2) {
	StringBuilder sb=new StringBuilder();
	int Minlength=Math.min(s1.length(), s2.length());
	for(int i=0;i<Minlength;i++) {
		char c=s1.charAt(i);
		char c1=s2.charAt(i);
		sb.append(c);
	sb.append(c1);}
	if(s1.length()>s2.length()) {
		sb.append(s1.substring(Minlength));
		
	}if(s2.length()>s1.length()){
		sb.append(s2.substring(Minlength));
	}
	
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="vamshi";String s2="Sravyamaa";
System.out.println(MergingString(s1, s2));
	}

}
