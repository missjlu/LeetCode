public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
        return "";

    String shortestString = strs[0];

    // find the shortest
    for (int i = 1; i < strs.length; i++) {
        if (strs[i].length() < shortestString.length()){
            shortestString = strs[i];
        }
    }

    //compare each string on every character
    for (int i = 0; i < shortestString.length(); i++) {
        for (int j = 1; j < strs.length; j++) {
            if (strs[j].charAt(i) == strs[j - 1].charAt(i))
                continue;
            else
                return strs[0].substring(0, i);
        }
    }
    return shortestString;
    }
}