class Solution {
    public int[][] generateMatrix(int n) {
         int[][] matrix = new int[n][n];

        int startingRow = 0;
        int endingRow = n - 1;
        int startingCol = 0;
        int endingCol = n - 1;

        int num = 1;

        while (startingRow <= endingRow && startingCol <= endingCol) {

            // Left -> Right
            for (int col = startingCol; col <= endingCol; col++) {
                matrix[startingRow][col] = num++;
            }
            startingRow++;

            // Top -> Bottom
            for (int row = startingRow; row <= endingRow; row++) {
                matrix[row][endingCol] = num++;
            }
            endingCol--;

            // Right -> Left
            if (startingRow <= endingRow) {
                for (int col = endingCol; col >= startingCol; col--) {
                    matrix[endingRow][col] = num++;
                }
                endingRow--;
            }

            // Bottom -> Top
            if (startingCol <= endingCol) {
                for (int row = endingRow; row >= startingRow; row--) {
                    matrix[row][startingCol] = num++;
                }
                startingCol++;
            }
        }

        return matrix;
    }
}
        

