class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // Transpose
        for (int row = 0; row < n; row++) {
            for (int col = row + 1; col < n; col++) {

                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }

        // Reverse each row
        for (int row = 0; row < n; row++) {

            int startCol = 0;
            int endCol = n - 1;

            while (startCol < endCol) {

                int temp = matrix[row][startCol];
                matrix[row][startCol] = matrix[row][endCol];
                matrix[row][endCol] = temp;

                startCol++;
                endCol--;
            }
        }
        
    }
}