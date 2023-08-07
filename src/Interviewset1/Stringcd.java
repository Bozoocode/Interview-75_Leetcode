package Interviewset1;
public class Stringcd{
public static String commonGcd(String str1, String str2) {
  if(!(str1+str2).equals(str2+str1)) {
	  return"";
  }
  int gcd=Euclidalgorithmgcdfinder(str1.length(), str2.length());
  return str2.substring(0,gcd);
  
}
public static int Euclidalgorithmgcdfinder(int a1,int a2) {
	if(a2==0) {
		return a1;
	}return Euclidalgorithmgcdfinder(a2, a1%a2);
}

public static void main(String[] args) {
    String str1 = "ABABAB";
    String str2 = "ABAB";
    String common = commonGcd(str1, str2);
    System.out.println("Common characters: " + common);
}
}