public class FindMinimumRotatedSortedArray {
    
    static int findMin(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int middle = left + (right - left)/2;
            if (middle > 0 && nums[middle] < nums[middle - 1]) {
                return nums[middle];
            } else if (nums[left] < nums[middle] && nums[middle] > nums[right]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return nums[left];
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(findMin(nums));
    }
}
