class FindPivotIndex {

    static int pivotIndex(int[] nums) {

        int totalSum = 0;
        for (int number : nums) {
            totalSum += number;
        }

        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            if ((currentSum - nums[i])* 2 == totalSum - nums[i]) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(nums));
    }
}