class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        // total no. of elements mus remain same
        if(m*n != r*c){
            return mat;
        }
        int[][] ans = new int[r][c];

        for(int i = 0;i <m*n;i++){
            // original matrix position
            int oldRow = i/n;
            int oldCol = i%n;

            // new matrix position
            int newRow = i/c;
            int newCol = i%c;
            ans[newRow][newCol] = mat[oldRow][oldCol];
        }
        return ans;
    }
}