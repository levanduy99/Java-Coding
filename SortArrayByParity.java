public class SortArrayByParity {
    
    //solution 1
    public static int[] sortArrayByParity1(int[] nums) {
        int[] result = new int[nums.length];
        int indexBegin = 0;
        int indexEnd = nums.length - 1;
        for (int num : nums) {
            if (num % 2 == 0) {
                result[indexBegin++] = num;
            } else {
                result[indexEnd--] = num;
            }
        }

        return result;
    }

    //solution 2
    public static int[] sortArrayByParity(int[] nums) {

        int i = 0;
        int j = nums.length - 1;
        
        while (i < j) {
            if (nums[i] % 2 > nums[j] % 2) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            if (nums[i] % 2 == 0) {
                i++;
            }
            if (nums[j] % 2 == 1) {
                j--;
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        
        for (int num : sortArrayByParity(nums)) {
            System.out.print(num + " ");
        }
    }
}
