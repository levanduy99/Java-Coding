public class SortArrayByParityII {

    // solution 1
    public static int[] sortArrayByParityII1(int[] nums) {

        int[] result = new int[nums.length];
        int indexEven = 0;
        int indexOdd = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                result[indexEven] = nums[i];
                indexEven += 2;
            } else {
                result[indexOdd] = nums[i];
                indexOdd += 2;
            }
        }

        return result;
    }

    // solution 2
    public static int[] sortArrayByParityII(int[] nums) {

        int l = 0;
        int r = nums.length - 1;

        while (l < r) {

        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 1, 4, 0, 0, 4, 3, 3 };
        for (int num : sortArrayByParityII1(nums)) {
            System.out.print(num + " ");
        }
    }
}
