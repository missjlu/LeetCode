public class Solution {
    public List<List<Integer>> subsets(int[] S) {
        
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> emptySet = new ArrayList();
        res.add(emptySet);
        
        
        if(S == null || S.length == 0)
            return res;
        Arrays.sort(S);
        int start =0;
        
        for(int i=0; i<S.length; i++) {
            
            int lastSize = res.size();
            for(int j=start; j<lastSize; j++) {
                List<Integer> item = new ArrayList<>(res.get(j));
                item.add(S[i]);
                res.add(item);
            }
            
            if( i<S.length-1 && S[i+1] == S[i])
                start = lastSize;
            else
                start = 0;
            
            
            
        }
    
        
        return res;
        
    }
}