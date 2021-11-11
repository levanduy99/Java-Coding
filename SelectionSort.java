public class SelectionSort {
    
    public static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                nums[i] = swap(nums[minIndex], nums[minIndex] = nums[i]);
            }
        }
    }

    public static int swap (int ... numbers) {
        return numbers[0];
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 5, 3, 4};
        selectionSort(nums);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
