package Interviewset1;

public class ReverseWordsin_String {
public static String myreverse(String queue) {
	String my=queue.trim().replaceAll("\\s{2,}", " ");
	StringBuilder sb=new StringBuilder();
	String[] mystring=my.split(" ");
	for(int i=mystring.length-1;i>=0;i--) {
			sb.append(mystring[i]);
if(i>0) {
		sb.append(" ");}
	}return sb.toString();
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String mystring="a good   example";
System.out.println(myreverse(mystring));
	}

}
