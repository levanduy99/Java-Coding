class NumberOfIslands {

    public static int numberIslands(char[][] grid) {

        int countIsland = 0;

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == '1') {
                    /**
                     * row = r - 1 && col = c // up
                     * row = r + 1 && col = c // down
                     * row = r && col = c - 1 // left
                     * row = r && col = c + 1 // right
                     */
                    int countWater = 0;
                    //case UP
                    if (isWater(grid, r - 1, c)) {
                        countWater++;
                    }
                    //case DOWN
                    if (isWater(grid, r + 1, c)) {
                        countWater++;
                    }
                    //case LEFT
                    if (isWater(grid, r, c - 1)) {
                        countWater++;
                    }
                    //case RIGHT
                    if (isWater(grid, r, c + 1)) {
                        countWater++;
                    }
                    //check island
                    if (countWater >= 3) {
                        countIsland++;
                    }
                }
            }
        }

        return countIsland;
    }

    public static boolean isWater(char[][] grid, int r, int c) {
        
        if (r < 0 || r >= grid.length) {
            return true;
        } 

        if (c < 0 || c >= grid[0].length) {
            return true;
        }

        if (grid[r][c] == '0') {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        char[][] grid = {
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'}
        };
        System.out.println(numberIslands(grid));
    }
}