import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();
        int rowBegin = 0;
        int rowEnd = matrix.length - 1;
        int columnBegin = 0;
        int columnEnd = matrix[0].length - 1;

        while (columnBegin <= columnEnd && rowBegin <= rowEnd) {
            for (int i = columnBegin; i <= columnEnd; i++) {
                result.add(matrix[rowBegin][i]);
            }
            rowBegin++;

            for (int i = rowBegin; i <= rowEnd; i++) {
                result.add(matrix[i][columnEnd]);
            }
            columnEnd--;

            if (rowBegin <= rowEnd) {
                for (int i = columnEnd; i >= columnBegin; i--) {
                    result.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;

            if (columnBegin <= columnEnd) {
                for (int i = rowEnd; i >= rowBegin; i--) {
                    result.add(matrix[i][columnBegin]);
                }
            }
            columnBegin++;
        }


        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {{ 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }};
        System.out.println(spiralOrder(matrix));
    }
}
