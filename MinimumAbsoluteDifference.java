import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
    
    static List<List<Integer>> minimumAbsDifference(int[] array) {

        Arrays.sort(array);
        int minDifference = Integer.MAX_VALUE;
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < array.length - 1; i++) {
            minDifference = Math.min(array[i + 1] - array[i], minDifference);
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] - array[i] == minDifference) {
                result.add(Arrays.asList(array[i], array[i + 1]));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = {3, 8, -10, 23, 19, -4, -14, 27};
        System.out.println(minimumAbsDifference(array));
    }
}
