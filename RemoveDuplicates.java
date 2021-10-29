class RemoveDuplicates {

    public static void removeElement(int[] nums, int index) {
        for (int i = index; i < nums.length - 1; i++) {
            nums[i] = nums[i+1];
        }
    } 

    //solution 1
    public static int removeDuplicates(int[] nums) {

        int k = nums.length;

        for (int i = 1; i < k; i++) {
            if (nums[i] == nums[i - 1]) {
                removeElement(nums, i);
                i --;
                k --;
            }
        }

        return k;
    }

    //solution 2
    public static int removeDuplicatesElement(int[] nums) {

        int size = nums.length;
        int k = 0;

        if (size < 2) {
            return size;
        }

        for (int i = 1; i < size; i++) {
            if (nums[i] != nums[i-1]) {
                nums[++k] = nums[i];
            }
        }

        return k+1;
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 2, 3, 4, 4, 5, 5, 5, 5}; 
        
        // int k = removeDuplicates(nums);
        int k = removeDuplicatesElement(nums);

        for (int i = 0; i < k; i++) {
            System.out.println(nums[i]);
        }
    }
}