public class SortColors {
    
    static void sortColors(int[] nums) {

        int start = 0;
        int end = nums.length - 1;
        int index = 0;

        while (start < end && index <= end) {
            if (nums[index] == 0) {
                nums[index++] = nums[start];
                nums[start++] = 0;
            } else if (nums[index] == 2) {
                nums[index] = nums[end];
                nums[end--] = 2;
            } else {
                index++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        for (int number : nums) {
            System.out.print(number + " ");
        }
    }
}
