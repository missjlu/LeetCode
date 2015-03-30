public class Solution {
    public List<List<Integer>> threeSum(int[] num) {
        List<List<Integer>> res = new ArrayList<>();
        
        if(num == null || num.length <= 2)
            return res;
            
        Arrays.sort(num);
        //the number at the end of the list has more choices when trying to make up
        //threeSum, so if it cannot form a valid 3Sum, the element before it and equals to it
        //will not be able to form a valid 3Sum either,(else if it can, the 3Sum the element 
        //before it can form will also be included) then we can escape it
        for(int i=num.length-1; i>=2; i--) {
            
            
            //escape duplicates
            if(i<num.length-1 && num[i] == num[i+1])
                    continue;
            
            List<List<Integer>> currRes = twoSum(num, i-1, -num[i]);
            
            for(int j=0; j<currRes.size(); j++) {
                
                currRes.get(j).add(num[i]);
                
            }
            
            res.addAll(currRes);
            
        }
        
        return res;
        
    }
    
    
    private List<List<Integer>> twoSum(int[] num, int end, int target) {
        
        List<List<Integer>> res = new ArrayList<>();
        
        int start = 0;
        
        while(end>start) {
        
            if(num[start] + num[end] == target) {
                
                List<Integer> item = new ArrayList<>();
                item.add(num[start]);
                item.add(num[end]);
                res.add(item);
                
                //if found, first change the pointer
                start++;
                end--;
                
                
                //important to make sure there is no duplicate
                while(start<end && num[start] == num[start-1])
                    start++;
                while(end>start && num[end] == num[end+1])
                    end--;
                
                
            }
        
            else if(num[start] + num[end] > target) {
                end--;
            }
        
            else {
                start++;
            }
        
        }
        
        return res;
    }
    
    
    
    
    
    
    
}