public class Solution {
    int ones, twos, threes = 0;
    public int singleNumber(int[] A) {
        for(int i=0; i<A.length; i++) {
            twos |= ones & A[i];
            ones ^= A[i];
            threes = ones & twos;
            ones &= ~threes;
            twos &= ~threes;
        }
        return ones;
    }
}