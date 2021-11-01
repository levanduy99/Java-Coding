public class MissingNumber {

    public static int missingNumber(int[] nums) {

        int missingNumber = nums.length;

        for (int i = 0; i < nums.length; i++) {
            missingNumber = missingNumber + i - nums[i];
        }

        return missingNumber;
    }
    
    public static void main(String[] args) {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(missingNumber(nums));
    }
}
