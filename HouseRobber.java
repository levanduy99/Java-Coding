public class HouseRobber {

    public static int rob(int[] nums) {

        int size = nums.length;

        if (size < 1) {
            return -1;
        }

        if (size == 1) {
            return nums[0];
        }

        int sumEven = 0, sumOdd = 0;

        int index = 0;
        while (true) {
            sumEven += nums[index++];
            if (index >= size) {
                break;
            }
            sumOdd += nums[index++];
            if (index >= size) {
                break;
            }
        }

        return sumEven > sumOdd ? sumEven : sumOdd;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3,   1};
        System.out.println(rob(nums));
    }
}
