public class Solution {
    public boolean isPalindrome(int x) {
        
        if(x<0) return false;
        
        int div = 1;
        int num = x;
        
        while(num/div>=10){
            div *= 10;
        }
        
        while(x>0) {
            int right = x%10;
            int left = x/div;
            if(left != right) return false;
            x %= div;
            x /=10;
            div /=100;
            
        }
        
        return true;
    }
}