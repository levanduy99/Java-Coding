import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {
    
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            if (i == 1) {
                List<Integer> row1 = Arrays.asList(1);
                triangle.add(row1);
            } else if (i == 2) {
                List<Integer> row2 = Arrays.asList(1, 1);
                triangle.add(row2);
            } else {
                List<Integer> row = new ArrayList<>(); 
                for (int j = 1; j <= i; j++) {
                    if (j == 1 || j == i) {
                        row.add(1);
                    } else {
                        row.add(triangle.get(i - 2).get(j - 1) + triangle.get(i - 2).get(j - 2));
                    }
                }
                triangle.add(row);
            }
        }

        return triangle;
    }

    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> triangle = generate(numRows);
        System.out.println(triangle);
    }
}
