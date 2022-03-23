import java.util.Arrays;

class PartitionEqualSubsetSum {

    static boolean canPartition(int[] nums) {

        int sumArray = 0;

        for (int number : nums) {
            sumArray += number;
        }

        if (sumArray % 2 != 0) {
            return false;
        } 

        Arrays.sort(nums);

        for (int i = nums.length - 1; i >= 0; i--) {
            
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(canPartition(nums));
    }
}