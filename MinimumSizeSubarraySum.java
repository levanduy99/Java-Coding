public class MinimumSizeSubarraySum {
    
    //solution 1
    static int minSubArrayLen1(int target, int[] nums) {
        int minSubArrayLen = nums.length;
        int flag = 0;
        for (int i = 0; i < nums.length; i++) {
            int sumSubArray = 0;
            for (int j = i; j < nums.length; j++) {
                sumSubArray += nums[j]; 
                if (sumSubArray >= target) {
                    if (j - i < minSubArrayLen) {
                        minSubArrayLen = j - i + 1;
                    }
                    flag = 1;
                    break;
                }
            }
        }
        return flag == 1 ? minSubArrayLen : 0;
    }

    //solution 2
    static int minSubArrayLen(int target, int[] nums) {

        int result = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            while (sum >= target) {
                result = Math.min(result, i + 1 - left);
                sum -= nums[left];
                left++;
            } 
        }

        return result != Integer.MAX_VALUE ? result : 0;
    }

    public static void main(String[] args) {
        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};
        System.out.println(minSubArrayLen(target, nums));
    }
}
