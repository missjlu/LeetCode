public class Solution {
    
    
    // The essence of the recursive helper() is to choose an Element from the remaining Set
    // 1C5 --> 1C4 --> 1C3 ..., and then check if the current item could meet the requirement
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        
        Arrays.sort(candidates);
        
        helper(candidates, 0, target, new ArrayList<>(), res);
        
        return res;
        
    }
    
    private List<List<Integer>> helper(int[] candidates, int start, int target, List<Integer> item, List<List<Integer>> res) {
        
        
        if(target == 0) {
            res.add(new ArrayList<>(item));
            return res;
        }
        
        if(target < 0) {
            return res;
        }
        
        
        for(int i=start; i < candidates.length; i++) {
            
            if(i>0 && candidates[i] == candidates[i-1])
                continue;
        
            item.add(candidates[i]);
            helper(candidates, i, target-candidates[i], item, res);
            item.remove(item.size()-1);
            
        }
        
        return res;
        
    }
    
    
    
    
    
}