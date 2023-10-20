class Solution {
      public int[] countBits(int n) {
        int[] result = new int[n+1];
        for (int i = 0; i <= n; i++) {
            int noOfOnes = 0;
            int j = i;
            while (j>=1) {
                if (j%2==1) {
                    noOfOnes++;
                }
                j = j/2;   
            }
            result[i] = noOfOnes;
        }
        return result;
    }
}