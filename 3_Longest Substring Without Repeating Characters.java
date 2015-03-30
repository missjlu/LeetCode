public class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s == null || s.length()==0) return 0;
        
        Set<Character> set = new HashSet<>();
        int max = 0;
        
        //start is the begining of a string(contains the potential duplicated character)
        //end is the end of a string(does not contain the potential duplicated character)
        //e.g if abdcb  then start->end is bdc, not dcb
        int end = 0;
        int start = 0;
        
        while(end < s.length()) {
            
            if(set.contains(s.charAt(end))) {
                
                max = Math.max(max, end-start);
                //pay attention to this condition,the potential duplicated
                //element should be in the Set for next round check, e.g: EEE, then do not delete the character from the set
                
                //move to the position right after the duplicated element, but don't delete the element
                while(s.charAt(start)!=s.charAt(end)) {
                    set.remove(s.charAt(start));
                    start++;
                }
                start++;
                
            }
                
            else{
                set.add(s.charAt(end));
            }
            
            end++;
            
            
        }
        //don't forget to check for last index
        max = Math.max(max,end-start);
        
        return max;
    }
}