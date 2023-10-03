class Solution {
    public int arraySign(int[] nums) {
    short countOfNeg = 0;
    int len = nums.length;
    for (int i = 0; i<len; i++){
    if (nums[i] == 0) return 0;
    if (nums[i] < 0) countOfNeg++;
    }
    return ((countOfNeg%2==0) ? 1: -1);
    }
}