public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        
        if(n==0)
            return res;
            
        return helper(n,n,new String(), res);
        
    }
    
    private List<String> helper(int left, int right, String item, List<String> res) {
        
        if(left>right)
            return res;
        
        if(left==0 && right==0)
            res.add(new String(item));
        
        
        
        if(left>0)
            helper(left-1, right, item+"(", res);
        if(right>0)
            helper(left, right-1, item+")", res);
        
        return res;
    }
    
    
    
}