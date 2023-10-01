public class second {
    public static int[] shuffle(int[] nums, int n) {
        int[] finalArray = new int[nums.length];
        int i = 0;
        int j = nums.length/2;
        for(int k = 0; k<nums.length;k+=2){
            finalArray[k] = nums[i++];
            finalArray[k+1] = nums[j++];
        }
        return finalArray;
    }
    public static void main(String[] args) {
        int[] first = {1,2,3,4,5,6};
        int[] nums = shuffle(first,3);
        for(int i = 0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}