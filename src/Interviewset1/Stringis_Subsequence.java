package Interviewset1;

public class Stringis_Subsequence {
	public static boolean isSubSequence(String str1,String str2) {
		    if (str1 == null || str2 == null) {
		        return false;
		    }

		    
		        int idx = 0;
		        for (char ch : str2.toCharArray()) {
		            if (ch == str1.charAt(idx)) {
		                idx++;
		            }
		            if (idx == str1.length()) {
		                return true;
		            }
		        }

		        return idx == str1.length();
		    }

		    
		

	    public static void main(String[] args) {
		// TODO Auto-generated method stub
String a1="ab";String s2="baab";
System.out.println(isSubSequence(a1, s2));
	}

}
