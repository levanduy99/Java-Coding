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
    public static int[] sortArrayByParityII2(int[] nums) {

        int indexEven = 0;
        int indexOdd = nums.length - 1;

        while (indexEven < nums.length - 1 && indexOdd > 0) {

            if (nums[indexEven] % 2 == 0) {
                indexEven += 2;
            } else if (nums[indexOdd] % 2 == 0) {
                int temp = nums[indexEven];
                nums[indexEven] = nums[indexOdd];
                nums[indexOdd] = temp;

                indexEven += 2;
                indexOdd -= 2;
            }
            
            if (indexEven < nums.length - 1 && indexOdd > 0) {
                if (nums[indexOdd] % 2 != 0) {
                    indexOdd -= 2;
                } else if (nums[indexEven] % 2 != 0) {
                    int temp = nums[indexEven];
                    nums[indexEven] = nums[indexOdd];
                    nums[indexOdd] = temp;

                    indexEven += 2;
                    indexOdd -= 2;
                }
            }

        }

        return nums;
    }

    // solution 3
    public static int[] sortArrayByParityII(int[] nums) {

        int indexEven = 0;
        int indexOdd = 1;
        int size = nums.length;

        while (indexEven < size && indexOdd < size) {

            while (indexEven < size && nums[indexEven] % 2 == 0) {
                indexEven += 2;
            }

            while (indexOdd < size && nums[indexOdd] % 2 != 0) {
                indexOdd += 2;
            }

            if (indexEven < size && indexOdd < size) {
                int temp = nums[indexEven];
                nums[indexEven] = nums[indexOdd];
                nums[indexOdd] = temp;
            }
        }

        return nums;
    }    

    public static void main(String[] args) {
        int[] nums = {4, 2, 5, 7};
        for (int num : sortArrayByParityII(nums)) {
            System.out.print(num + " ");
        }
    }
}
