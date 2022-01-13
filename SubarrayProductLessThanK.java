public class SubarrayProductLessThanK {
   
    //solution 1
    static int numSubarrayProductLessThanK1(int[] nums, int k) {

        int result = 0;

        for (int i = 0; i < nums.length; i++) {

            int index = i;
            int product = 1;

            while (index < nums.length) {
                product = nums[index++] * product;
                if (product < k) {
                    result++;
                } else {
                    break;
                }
            }

        }

        return result;
    }

    //solution 2
    static int numSubarrayProductLessThanK(int[] nums, int k) {
        
        int result = 0;
        int product = 1;

        int left = 0, right = 0;

        while (right < nums.length) {

            product *= nums[right];

            while (product >= k) {
                product /= nums[left];
                left++;
            }

            result += right - left + 1;

            right++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 6};
        System.out.println(numSubarrayProductLessThanK(nums, 100));
    }
}
