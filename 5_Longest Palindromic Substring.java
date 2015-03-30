public class Solution {
    public String longestPalindrome(String s) {
        int left = 0, right = 0;
        for(int i=0; i< s.length(); i++) {
            int length1 = extendString(i,i,s);
            int length2 = extendString(i,i+1,s);
            int length = Math.max(length1, length2);
            if(right-left < length) {
                left = i - (length-1)/2;
                right = i + length/2;
            }

            
        }
        return s.substring(left, right+1);
        
    }
    
    private int extendString(int left, int right,String s) {
        //do not use if(s.charAt(left) == s.charAt(right)) in the while loop, loop will never end
        while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
        }
        
        return right-left-1;
        
        
    }
    
    
}