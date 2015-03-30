public class Solution {
    public int lengthOfLastWord(String s) {
        if(s.trim().length() == 0)
            return 0;
        else {
            int counter = 0;
            for(int i=s.trim().length()-1;i>=0;i--) {
                if(!Character.isWhitespace(s.trim().charAt(i)))
                    counter++;
                else break;
            }
            return counter;
        }
    }
}