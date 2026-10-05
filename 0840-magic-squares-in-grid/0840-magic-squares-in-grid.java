class Solution {
    public int numMagicSquaresInside(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;

        for (int i = 0; i <= rows - 3; i++) {
            for (int j = 0; j <= cols - 3; j++) {

                if (isMagic(grid, i, j)) {
                    count++;
                }
            }
        }

        return count;
    }

    public boolean isMagic(int[][] grid, int r, int c) {

        boolean[] seen = new boolean[10];

        // Check numbers 1 to 9
        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {

                int num = grid[i][j];

                if (num < 1 || num > 9 || seen[num]) {
                    return false;
                }

                seen[num] = true;
            }
        }

        // Rows
        for (int i = r; i < r + 3; i++) {
            if (grid[i][c] + grid[i][c + 1] + grid[i][c + 2] != 15) {
                return false;
            }
        }

        // Columns
        for (int j = c; j < c + 3; j++) {
            if (grid[r][j] + grid[r + 1][j] + grid[r + 2][j] != 15) {
                return false;
            }
        }

        // Diagonal 1
        if (grid[r][c] + grid[r + 1][c + 1] + grid[r + 2][c + 2] != 15) {
            return false;
        }

        // Diagonal 2
        if (grid[r][c + 2] + grid[r + 1][c + 1] + grid[r + 2][c] != 15) {
            return false;
        }

        return true;
    }
}