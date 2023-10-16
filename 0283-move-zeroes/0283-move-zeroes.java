class Solution {
    public void moveZeroes(int[] nums) {
        int f = 0;
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            if (nums[i]==0 ) {
                continue;
            }
            int temp = nums[f];
            nums[f++] = nums[i];
            nums[i] = temp;
        }
    }
}