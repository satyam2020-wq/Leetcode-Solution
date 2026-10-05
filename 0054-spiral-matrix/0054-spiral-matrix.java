class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();

        int startingRow = 0;
        int endingRow = matrix.length - 1;
        int startingCol = 0;
        int endingCol = matrix[0].length - 1;

        while (startingRow <= endingRow && startingCol <= endingCol) {

            // Row wise: Left -> Right
            for (int col = startingCol; col <= endingCol; col++) {
                result.add(matrix[startingRow][col]);
            }
            startingRow++;

            // Col wise: Top -> Bottom
            for (int row = startingRow; row <= endingRow; row++) {
                result.add(matrix[row][endingCol]);
            }
            endingCol--;

            // Row wise: Right -> Left
            if (startingRow <= endingRow) {
                for (int col = endingCol; col >= startingCol; col--) {
                    result.add(matrix[endingRow][col]);
                }
                endingRow--;
            }

            // Col wise: Bottom -> Top
            if (startingCol <= endingCol) {
                for (int row = endingRow; row >= startingRow; row--) {
                    result.add(matrix[row][startingCol]);
                }
                startingCol++;
            }
        }

        return result;
    }
}