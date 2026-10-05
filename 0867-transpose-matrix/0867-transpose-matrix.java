class Solution {
    public int[][] transpose(int[][] matrix) {
        
        if (matrix == null || matrix.length == 0) {
        return new int[0][0];
    }

    int totalRows = matrix.length;
    int totalCols = matrix[0].length;

    int newTotalRows = totalCols;
    int newTotalCols = totalRows;

    int[][] ans = new int[newTotalRows][newTotalCols];

    for (int i = 0; i < totalRows; i++) {
        for (int j = 0; j < totalCols; j++) {
            ans[j][i] = matrix[i][j];
        }
    }

    return ans;
        
    }
}