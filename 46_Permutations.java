public class Solution {
    public List<List<Integer>> permute(int[] num) {
        
        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[num.length];
        
        helper(num, used, new ArrayList<>(), res);
        
        return res;
        
    }

    public List<List<Integer>> helper(int[] num, boolean[] used, List<Integer> item, List<List<Integer>> res){
        
        if(item.size() == num.length) {
            res.add(new ArrayList<>(item));
            return res;
        }
        
        for(int i=0; i< num.length; i++) {
            
            if(i>0 && num[i]==num[i-1])
                continue;
            
            if(!used[i]) {
                used[i] = true;
                item.add(num[i]);
                helper(num, used, item, res);
                item.remove(item.size()-1);
                used[i] = false;
            }
            
        }
        
        return res;
        
    }
}