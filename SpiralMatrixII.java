public class SpiralMatrixII {
    
    static int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int value = 1;
        int rowBegin = 0;
        int rowEnd = n - 1;
        int columnBegin = 0;
        int columnEnd = n - 1;

        while (rowBegin <= rowEnd && columnBegin <= columnEnd) {

            for (int i = columnBegin; i <= columnEnd; i++) {
                result[rowBegin][i] = value++;
            }
            rowBegin++;

            for (int i = rowBegin; i <= rowEnd; i++) {
                result[i][columnEnd] = value++;
            }
            columnEnd--;

            if (rowBegin <= rowEnd) {
                for (int i = columnEnd; i >= columnBegin; i--) {
                    result[rowEnd][i] = value++;
                }
            }
            rowEnd--;

            if (columnBegin <= columnEnd) {
                for (int i = rowEnd; i >= rowBegin; i--) {
                    result[i][columnBegin] = value++;
                }
            }
            columnBegin++;
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] matrix = generateMatrix(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
