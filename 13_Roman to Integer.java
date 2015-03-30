public class Solution {
    public int romanToInt(String s) {
        
        int res=0;
        int pre =0;
        Map<Character, Integer> map = new HashMap<Character, Integer>(){
            {
                put('I',1);
                put('V',5);
                put('X',10);
                put('L',50);
                put('C',100);
                put('D',500);
                put('M',1000);
            }
        };
        
        for(int i=0; i<s.length(); i++) {
            int cur = map.get(s.charAt(i));
            if(cur>pre)
                res += cur-pre*2;
            else
                res += cur;
                
            pre = cur;
        }
        
        return res;
    }
}