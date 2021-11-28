public class Search2DMatrix {

    // solution 1
    public static boolean searchMatrix1(int[][] matrix, int target) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }

        return false;
    }

    // solution 2
    public static boolean searchMatrix2(int[][] matrix, int target) {

        for (int[] array : matrix) {
            if (array[matrix[0].length - 1] >= target) {
                return binarySearch(array, target);
            }
        }

        return false;
    }

    public static boolean binarySearch(int[] array, int target) {

        int l = 0;
        int r = array.length - 1;

        while (l <= r) {

            int m = l + (r - l) / 2;

            if (array[m] == target) {
                return true;
            }

            if (array[m] > target) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }

        return false;
    }

    // solution 3
    public static boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length;
        int columns = matrix[0].length;

        int left = 0;
        int right = columns*rows - 1;

        while (left <= right) {
            int midpoint = left + (right - left)/2;
            int midpointElement = matrix[midpoint/columns][midpoint%columns];

            if (midpointElement == target) {
                return true;
            } else if (midpointElement > target) {
                right = midpoint - 1;
            } else {
                left = midpoint + 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        System.out.println(searchMatrix(matrix, 1));
    }
}
