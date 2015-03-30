public class Solution {
    public String convertToTitle(int n) {
        StringBuilder s = new StringBuilder();
        while(n>0) {
            char curr = (char) ((n-1)%26 + 'A');
            s.insert(0,curr);
            n = (n-1)/26;
        }
        return s.toString();
    }
}