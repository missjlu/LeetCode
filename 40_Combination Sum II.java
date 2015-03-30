public class Solution {
    public List<List<Integer>> combinationSum2(int[] num, int target) {
        List<List<Integer>> res = new ArrayList<>();
        
        if(num == null || num.length ==0)
            return res;
        
        Arrays.sort(num);
        
        return helper(num, 0, target, new ArrayList<>(), res);
        
    }
    
    private List<List<Integer>> helper(int[] num, int start, int target, List<Integer> item, List<List<Integer>> res) {
        
        if(target == 0) {
            res.add(new ArrayList<>(item));
            return res;
        }
        
        if(target < 0) {
            return res;
        }
        
        for(int i=start; i<num.length;i++) {
            
            if(i>start && num[i] == num[i-1])
                continue;
            
            item.add(num[i]);
            helper(num, i+1, target-num[i], item, res);
            item.remove(item.size()-1);
        }
        
        return res;
        
    }
    
    
    
    
}