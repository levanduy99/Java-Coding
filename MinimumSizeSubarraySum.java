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


        return -1;
    }

    public static void main(String[] args) {
        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};
        System.out.println(minSubArrayLen1(target, nums));
    }
}
