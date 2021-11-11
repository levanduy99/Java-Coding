public class SquaresSortedArray {
    
    //solution 1 squaring element of array after using insertion sort
    public static int[] sortedSquares1(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        insertionSort(nums);

        return nums;
    }

    public static void insertionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int key = nums[i + 1];
            int index = i;
            while (index >= 0 && key < nums[index]) {
                nums[index + 1] = nums[index];
                index--;
            }
            nums[index + 1] = key;
        }
    }

    //solution 2
    public static int[] sortedSquares2(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = Math.abs(nums[i]);
                int index = i;
                while (index < nums.length && temp > nums[index]) {
                    nums[index] = nums[index + 1];
                    index++;
                }
                if (index != i) {
                    nums[index - 1] = temp;
                }
                i--;
            } else {
                nums[i] = nums[i] * nums[i];
            }
        }

        return nums;
    }

    //solution 3
    public static int[] sortedSquares(int[] nums) {

        int size = nums.length;
        int[] result = new int[size];
        int index = size - 1;
        int l = 0, r = index;

        while (l <= r) {
            if (Math.abs(nums[l]) < Math.abs(nums[r])) {
                result[index--] = nums[r] * nums[r];
                r--;
            } else {
                result[index--] = nums[l] * nums[l];
                l++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        nums = sortedSquares(nums);
        for (int number : nums) {
            System.out.print(number + " ");
        }
    }
}
