public class MonotonicArray {
 
    static boolean isMonotonic(int[] nums) {
        
        boolean increasing = false, decreasing = false;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                decreasing = true;
            }
            if (nums[i] < nums[i + 1]) {
                increasing = true;
            }
        }

        if (increasing && decreasing) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3};
        System.out.println(isMonotonic(nums));   
    }
}
