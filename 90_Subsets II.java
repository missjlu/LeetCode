public class Solution {
    
    public List<List<Integer>> subsetsWithDup(int[] num) {
        
        if(num == null || num.length == 0)
            return null;
        
        Arrays.sort(num);
        
        List<Integer> arr = new ArrayList<>();
        arr.add(0);
        return helper(num, num.length-1, arr);
        
        
    }
    
    
    private List<List<Integer>> helper(int[] num, int index, List<Integer> lastSize) {
        
        if(index == -1) {
            List<List<Integer>> res = new ArrayList<>();
            List<Integer> item = new ArrayList<>();
            res.add(item);
            return res;
        }
        
        
        List<List<Integer>> res = helper(num, index-1, lastSize); 
            
            
            int size = res.size();
            int start = 0;
            if (index>0 && num[index] == num[index-1])
                start = lastSize.get(0);
            for(int j=start; j<size; j++) {
                List<Integer> item = new ArrayList<Integer>(res.get(j));
                item.add(num[index]);
                res.add(item);
            }
            
            lastSize.set(0,size);
        
        return res;
        
        
    }
    
    
    
    
    
}