class Solution {
     public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> nums = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (nums.containsKey(arr[i])) {
                nums.put(arr[i], (nums.get(arr[i])) + 1 );
            }
            else
            {
                nums.put(arr[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : nums.entrySet()) {
            int value = entry.getValue();
            if (moreThanOnce(value, nums)) {
                return false;
            }
        }
        return true;
    }

    public static boolean moreThanOnce(int value, HashMap<Integer,Integer> hashmap)
    {
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : hashmap.entrySet()) {
            int key = entry.getValue();
            if (key==value) {
                count++;
            }
            if (count==2) {
                return true;
            }
        }
        return false;
    }
}