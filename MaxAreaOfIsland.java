public class MaxAreaOfIsland {
    
    static int maxAreaOfIsLand(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    max = Math.max(max, area(i, j, grid));
                }
            }
        }

        return max;
    }

    static int area(int row, int column, int[][] grid) {

        if (row >= grid.length || row < 0 || column >= grid[0].length || column < 0) {
            return 0;
        }

        if (grid[row][column] == 0) {
            return 0;
        } 

        grid[row][column] = 0;
        int countIsland = 1;
        countIsland += area(row + 1, column, grid);
        countIsland += area(row - 1, column, grid);
        countIsland += area(row, column + 1, grid);
        countIsland += area(row, column - 1, grid);

        return countIsland;
    }


    public static void main(String[] args) {
        int[][] grid = {
            {0,0,1,0,0,0,0,1,0,0,0,0,0},
            {0,0,0,0,0,0,0,1,1,1,0,0,0},
            {0,1,1,0,1,0,0,0,0,0,0,0,0},
            {0,1,0,0,1,1,0,0,1,0,1,0,0},
            {0,1,0,0,1,1,0,0,1,1,1,0,0},
            {0,0,0,0,0,0,0,0,0,0,1,0,0},
            {0,0,0,0,0,0,0,1,1,1,0,0,0},
            {0,0,0,0,0,0,0,1,1,0,0,0,0}
        };
        System.out.println(maxAreaOfIsLand(grid));
    }
}
