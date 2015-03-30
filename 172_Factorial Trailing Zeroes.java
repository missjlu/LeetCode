public class Solution {
    public int trailingZeroes(int n) {
        //return n/5 + n/25 + n/125 + n/625 + n/3125 ...;
        int sum = 0;
        //int div = 5;
        int power = 1;
        int num = (int) (n/Math.pow(5,power));
        
        while(num>0) {
            sum += num;
            //div *= 5;
            num = (int) (n/Math.pow(5,++power));
        }
        
        return sum;
        
        
        
    }
}