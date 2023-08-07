package Interviewset1;

public class MaximumAverage_SubArray {
	public static double maximumarray(int[] floatsarray,int k) {
		int windowsum=0;
	int	partialsum=k;
		
	for(int i=0;i<k;i++)
		
			partialsum+=floatsarray[i];
	windowsum=partialsum;
		for(int end=k;end<floatsarray.length;end++) {
			partialsum+=floatsarray[end]-floatsarray[end-k];
			windowsum=Math.max(windowsum, partialsum);
			
		
		}
		
		return (double)windowsum/k;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] myarray= {1,12,-5,-6,50,3};
int k=4;
System.out.println(maximumarray(myarray, k));
	

}
}