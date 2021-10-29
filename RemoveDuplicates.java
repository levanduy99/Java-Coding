class RemoveDuplicates {

    public static void removeElement(int[] nums, int index) {
        for (int i = index; i < nums.length - 1; i++) {
            nums[i] = nums[i+1];
        }
    } 

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
    
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3, 4, 4, 5, 5, 5, 5}; 
        
        int k = removeDuplicates(nums);

        for (int i = 0; i < k; i++) {
            System.out.println(nums[i]);
        }
    }
}