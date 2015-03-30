public class Solution {
    public String addBinary(String a, String b) {
        
        if(a == null || a.length() == 0)
            return b;
        if(b == null || b.length() == 0)
            return a;
        
        
        int aIndex = a.length()-1;
        int bIndex = b.length()-1;
        int carry = 0;
        
        StringBuilder s = new StringBuilder();
        
        while(aIndex >= 0 || bIndex >=0) {
            int aNum = aIndex>=0 ? (int) a.charAt(aIndex)-'0' : 0;
            int bNum = bIndex>=0 ? (int) b.charAt(bIndex)-'0' : 0;
            int sum = aNum+bNum+carry;
            int digit = sum%2;
            carry = sum/2;
            s.append(digit);
            
            aIndex--;
            bIndex--;
            
        }
        
        if(carry>0)
            s.append(carry);
        
        return s.reverse().toString();
        
        
    }
}