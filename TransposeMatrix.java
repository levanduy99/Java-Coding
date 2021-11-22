public class TransposeMatrix {
    
    public static int[][] transpose(int[][] matrix) {

        int numberRow = matrix.length;
        int numberColumn = matrix[0].length;
        int[][] result = new int[numberColumn][numberRow];

        for (int i = 0; i < numberRow; i++) {
            for (int j = 0; j < numberColumn; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        for (int i = 0; i < transpose(matrix).length; i++) {
            for (int j = 0; j < transpose(matrix)[0].length; j++) {
                System.out.print(transpose(matrix)[i][j] + " ");
            }
            System.out.println();
        }
    }
}
