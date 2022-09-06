import java.util.ArrayList;

public class FindTheLargestThreeDistinct {

    private static ArrayList<Integer> threeLargest(int[] nums) {

        int third, second, first;
        third = second = first = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (first < nums[i]) {
                third = second;
                second = first;
                first = nums[i];
            }
            else if (second < nums[i]) {
                third = second;
                second = nums[i];
            }
            else if (third < nums[i]) {
                third = nums[i];
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(third);
        result.add(second);
        result.add(first);

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {10, 4, 3, 50, 23, 90};
        System.out.println(threeLargest(nums));
    }
}
