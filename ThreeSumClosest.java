import java.util.Arrays;

public class ThreeSumClosest {
    
    //solution 1
    public static int threeSumClosest1(int[] nums, int target) {

        int size = nums.length;
        int minRemaining = target;
        int threeSumClosest = 0;

        for (int i = 0; i <= size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    if (k == i || k == j) {
                        continue;
                    }
                    int threeSum = nums[i] + nums[j] + nums[k];
                    if (target - threeSum < minRemaining) {
                        threeSumClosest = threeSum;
                        minRemaining = target - threeSum;
                    }
                }
            }
        }

        return threeSumClosest;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        System.out.println(threeSumClosest1(nums, target));
    }
}
