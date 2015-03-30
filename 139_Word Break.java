public class Solution {
    //can[i] stores whether s.substring(0,i) can be presented by the dictionary
    public boolean wordBreak(String s, Set<String> dict) {
        int length = s.length();
        boolean[] can = new boolean[length+1];
        can[0] = true;
        for (int i = 1; i <= length; i++) {
            for (int j = 0; j < i; j++) {
                if (can[j] && dict.contains(s.substring(j, i))) {
                    can[i] = true;
                    break;
                }
            }
        }
        return can[length];
    }
}