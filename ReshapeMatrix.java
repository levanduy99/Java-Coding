public class ReshapeMatrix {
    
    static int[][] matrixReshape(int[][] mat, int r, int c) {

        int row = mat.length;
        int column = mat[0].length;

        if (r*c != row*column) {
            return mat;
        }

        int[][] result = new int[r][c];

        int indexR = 0;
        int indexC = 0;

        for (int i = 0; i < r; i ++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = mat[indexR][indexC];
                indexC++;
                if (indexC >= column) {
                    indexC = 0;
                    indexR++;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] mat = {{1, 2}, {3, 4}};
        mat = matrixReshape(mat, 1, 4);
        for (int[] array : mat) {
            for (int number : array) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
