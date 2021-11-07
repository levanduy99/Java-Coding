public class MaximumArray {
    
    public static int maxSubArray(int[] nums) {

        int start = 0;
        int end = 0;
        int maxSoFar = nums[0], maxEndingHere = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxEndingHere + nums[i]) {
                start = i;
                maxEndingHere = nums[i];
            } else {
                maxEndingHere += nums[i];
            }

            if (maxEndingHere > maxSoFar) {
                maxSoFar = maxEndingHere;
                end = i;
            }
        }

        System.out.println("Found maximum subarray between " + start + " and " + end);

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] nums = {-3, 1, -8, 4, -1, 2, 1, -5, 5};
        System.out.println(maxSubArray(nums));
    }
}
