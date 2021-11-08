public class RotateImage {

    public static int swap(int... numbers) {
        return numbers[0];
    }
    
    public static void rotate(int[][] matrix) {

        int size = matrix.length;

        //swap matrix[i][j] = matrix[j][i]
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                matrix[i][j] = swap(matrix[j][i], matrix[j][i] = matrix[i][j]);
            }
        }
    
        //flip the matrix horizontally
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size/2; j++) {
                matrix[i][j] = swap(matrix[i][size - j - 1], matrix[i][size - j - 1] = matrix[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix3 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrix4 = {
            {5, 1, 9, 11},
            {2, 4, 8, 10},
            {13, 3, 6, 7},
            {15, 14, 12, 16}
        };

        rotate(matrix4);
        int size = matrix4.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix4[i][j] + " ");
            }
            System.out.println();
        }
    }
}
