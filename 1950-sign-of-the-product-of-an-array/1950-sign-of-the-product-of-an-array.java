class Solution {
    public static int arraySign(int[] nums) {
        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==0) {
            return 0;
        }
        else if (product*nums[i]>0)
        product = 1;
        else
        product = -1;
    }
    return product;
    }
}