public class Solution {
    public List<List<Integer>> permuteUnique(int[] num) {
        List<List<Integer>> res = new ArrayList<>();
        if(num == null || num.length ==0)
            return res;
        //IMPORTANT    
        Arrays.sort(num);
        permuteHelper(num, new boolean[num.length], new ArrayList<Integer>(), res);
        return res;
    }
    
    private void permuteHelper(int[] num, boolean[] used, List<Integer> item, List<List<Integer>> res) {
        
        if(num.length == item.size()) {
            res.add(new ArrayList<Integer>(item));
            return;
        }
        
        for(int i=0; i< num.length; i++) {
            
            if(i>0 && !used[i-1] && num[i] == num[i-1]) continue;
            
            if(!used[i]) {
                used[i] = true;
                item.add(num[i]);
                permuteHelper(num, used, item, res);
                item.remove(item.size()-1);
                used[i] = false;
            }
            
        }
        
        
        
    }
    
    
    
}