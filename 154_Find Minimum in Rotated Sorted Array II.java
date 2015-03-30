public class Solution {
    public int findMin(int[] num) {
        int start = 0, end = num.length - 1;
        while(start < end && num[start] >= num[end]) {
            int mid = start + (end-start)/2;
            if(num[start] > num[mid]) end = mid;
            else if(num[start] < num[mid]) start = mid + 1;
            else start = start + 1;
        }
        return num[start];
    }
}