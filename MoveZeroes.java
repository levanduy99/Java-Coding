public class MoveZeroes {
    
    //solution 1 (using a copy of the array)
    public static int[] moveZeroes(int[] nums) {

        int size = nums.length;
        int[] result = new int[size];
        int index = 0;

        for (int i = 0; i < size; i++) {
            if (nums[i] != 0) {
                result[index++] = nums[i];
            }
        }

        return result;
    }

    //solution 2
    public static int[] move0(int[] nums) {

        int size = nums.length;
        int index = 0;

        for (int i = 0; i < size; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            } 
        }

        for (int i = index; i < size; i++) {
            nums[i] = 0;
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};   
        // int[] result = moveZeroes(nums);
        int[] result = move0(nums);
        
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
