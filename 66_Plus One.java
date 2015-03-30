public class Solution {
    public int[] plusOne(int[] digits) {
        int digit = digits.length;
        while(digit>0){
            digit--;
        if(digits[digit]<9) {
            digits[digit]++;
            return digits;
        }
        else digits[digit]=0;
        }
        int[] newdigits = new int[digits.length+1];
        newdigits[0] = 1;
        System.arraycopy(digits,0,newdigits,1,digits.length);
        return newdigits;
    }
}