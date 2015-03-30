public class Solution {
    public List<Integer> grayCode(int n) {
        
        List<Integer> res = new ArrayList<>();
        res.add(0);
        if(n==0) return res;
        
        res.add(1);
        
        for (int i=2; i<=n; i++) {
        
            for(int j=res.size()-1; j>=0;j--)
                res.add(res.get(j)+ (1<<i-1) );
        
        
        }
        
        
        
        return res;
        
    }

    
}