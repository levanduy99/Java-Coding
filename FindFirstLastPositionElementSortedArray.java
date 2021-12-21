public class FindFirstLastPositionElementSortedArray {
    
    static int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findStartingIndex(nums, target);
        result[1] = findEndingIndex(nums, target);
        return result;
    }

    static int findStartingIndex(int[] nums, int target) {

        int index = -1;
        int l = 0;
        int r = nums.length;

        while (l <= r) {
            int m = l + (r - l)/2;
            if (nums[m] >= target) {
                r = m - 1;
            } else {
                l = m + 1;
            }
            if (nums[m] == target) {
                index = m;
            }
        }

        return index;
    }

    static int findEndingIndex(int[] nums, int target) {

        int index = -1;
        int l = 0;
        int r = nums.length;

        while (l <= r) {
            int m = l + (r - l)/2;
            if (nums[m] > target) {
                r = m - 1;
            } else {
                l = m + 1;
            }
            if (nums[m] == target) {
                index = m;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 7, 7, 8, 8, 10};
        for (int i : searchRange(nums, 7)) {
            System.out.print(i + " ");
        }
    }
}
