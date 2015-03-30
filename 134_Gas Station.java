public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int sum = 0, total = 0, start = 0;
        
        for(int i= 0; i< gas.length; i++) {
            
            int diff = gas[i] - cost[i];
            
            sum += diff;
            total += diff;
            //if at ith station the sum is negative, it means no matter which station before ith station in the series the car is gonna start, it will not have enough gas (去除最先的车站只会使此时的sum值更少)
            if(sum<0) {
                sum = 0;
                start = i+1;
                
            }
            
            
            
            
            
        }
        
        return total>=0? start: -1;
        
    }
}