class Solution {
    public int diagonalSum(int[][] mat) {
        int size = mat.length;
        short firstPointer = 0;
        int endPointer = size-1;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += (mat[firstPointer][firstPointer] + mat[firstPointer++][endPointer--]);
        }
        return ((size%2==0) ? sum : sum-mat[size/2][size/2]);
    }
}