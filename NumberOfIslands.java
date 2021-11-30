class NumberOfIslands {

    public static int numberIslands(char[][] grid) {

        int countIsland = 0;

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == '1') {
                    removeIsland(r, c, grid);
                    countIsland++;
                }
            }
        }

        return countIsland;
    }

    static boolean removeIsland(int r, int c, char[][] grid) {

        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length) {
            return false;
        }

        if (grid[r][c] == '0') {
            return false;
        }

        grid[r][c] = '0';
        removeIsland(r + 1, c, grid);
        removeIsland(r - 1, c, grid);
        removeIsland(r, c + 1, grid);
        removeIsland(r, c - 1, grid);

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