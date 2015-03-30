public class Solution {
    public String reverseWords(String s) {
        StringBuilder reverse = new StringBuilder();
        for(int i = s.length()-1; i >= 0; i--) {
            while(i >= 0 && s.charAt(i) == ' ') i--;
            int j=i+1;
            while(i > 0 && s.charAt(i-1) != ' ') i--;
            if(reverse.length() !=0 && i>=0) reverse.append(" ");
            if(i>=0) reverse.append(s.substring(i,j));
        }
        return reverse.toString();
    }
}