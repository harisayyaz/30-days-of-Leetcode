class Solution {
    public int diagonalSum(int[][] mat) {
        int size = mat.length;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += (mat[i][i] + mat[i][size-i-1]);
        }
        return ((size%2==0) ? sum : sum-mat[size/2][size/2]);
    }
}