class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] ans = new int[rows * cols][2];

        int[][] directions = {
            {0, 1},    // right
            {1, 0},    // down
            {0, -1},   // left
            {-1, 0}    // up
        };

        int index = 0;
        int steps = 1;
        int dir = 0;

        ans[index++] = new int[]{rStart, cStart};

        while (index < rows * cols) {

            for (int twice = 0; twice < 2; twice++) {

                for (int s = 0; s < steps; s++) {

                    rStart += directions[dir][0];
                    cStart += directions[dir][1];

                    // Add only if inside the grid
                    if (rStart >= 0 && rStart < rows &&
                        cStart >= 0 && cStart < cols) {

                        ans[index++] = new int[]{rStart, cStart};
                    }
                }

                dir = (dir + 1) % 4;
            }

            steps++;
        }

        return ans;
    }
}