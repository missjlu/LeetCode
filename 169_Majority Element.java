public class Solution {
    
    
    public int majorityElement(int[] num) {
        int maj=0;
        int count = 0;
        int n = num.length;
        for (int i = 0; i < n; i++){
            if (count == 0){
                maj = num[i];
                count++;
            }
            else if (num[i] == maj){
                count++;
                if (count > n/2) return maj;
            }
            else count--;
        }
        return maj;
    }
}