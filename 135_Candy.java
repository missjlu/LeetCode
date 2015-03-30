public class Solution {
    public int candy(int[] ratings) {
        
        int[] candy = new int[ratings.length];
        int res = 0;
        
        candy[0]=1;
        for(int i=1; i<ratings.length; i++) {
            if(ratings[i]<=ratings[i-1])
                candy[i] = 1;
            else
               candy[i] = candy[i-1]+1; 
        }
        
        res = candy[ratings.length-1];
        for(int i= ratings.length-2; i>=0; i--) {
            int cur = 1;
            if(ratings[i]>ratings[i+1])
                cur = candy[i+1]+1;
            res +=  Math.max(cur, candy[i]);
            candy[i] = cur;
        }
        
        return res;
    }
}