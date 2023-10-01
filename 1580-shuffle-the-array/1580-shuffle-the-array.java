class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] finalArray = new int[nums.length];
        int i = 0;
        int j = nums.length/2;
        for(int k = 0; k<nums.length;k+=2){
            finalArray[k] = nums[i++];
            finalArray[k+1] = nums[j++];
        }
        return finalArray;
    }
}