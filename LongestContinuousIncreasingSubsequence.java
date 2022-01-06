public class LongestContinuousIncreasingSubsequence {
 
    static int lengthSubarrayIncreasing(int[] nums) {

        int maxLength = 1;
        int length = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                length++;
            } else {
                length = 1;
            }
            maxLength = Math.max(length, maxLength);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7};
        System.out.println(lengthSubarrayIncreasing(nums));
    }
}
