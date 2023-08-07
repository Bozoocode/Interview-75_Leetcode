package Interviewset1;

class CanPlace_flowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
       String s = "Vamshi";
       String b=s.toLowerCase();
       System.out.println(b);
    	char ch;
       StringBuilder sb=new StringBuilder();
    	if(n==0) {
        	return true;
        } 
    	for (int i=0;i < flowerbed.length;i++) {
    
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1; 
                n--;
if (n == 0) {
                    return true;                 }
            }}

        return false;    }

    public static void main(String[] args) {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;

        System.out.println(canPlaceFlowers(flowerbed, n)); // Output: true
    }
}
