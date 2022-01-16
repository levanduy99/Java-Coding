import java.util.Arrays;

public class SingleNumberII {

    // solution 1
    static int singleNumber1(int[] nums) {

        Arrays.sort(nums);

        // 1 1 1 5 9 9 9
        // 0 1 2 3 4 5 6

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                i += 2;
            } else {
                return nums[i];
            }
        }

        return nums[nums.length - 1];
    }

    //solution 2
    static int singleNumber(int[] nums) {

        int ones = 0, twos = 0;

        for (int number : nums) {
            ones = (ones ^ number) & ~twos;
            twos = (twos ^ number) & ~ones;
        }

        return ones;
    }

    public static void main(String[] args) {
        int[] nums = {9, 5, 1, 9, 1, 9, 1};
        System.out.println(singleNumber(nums));
    }
}
