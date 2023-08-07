package Interviewset1;

import java.util.Arrays;

public class Moves_zeros {
	public static void movesZero(int[] myarray) {
		int rightindex=0;
		for(int i=0;i<myarray.length;i++) {
			if(myarray[i]!=0) {
				myarray[rightindex]=myarray[i];
				rightindex++;
			}}
			while(rightindex<myarray.length) {
				myarray[rightindex]=0;
				rightindex++;
			
		
		
		 }
		}
			
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] myarray= {0,1,0,3,12};
movesZero(myarray);
System.out.println(Arrays.toString(myarray));

	}

}
