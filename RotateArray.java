class RotateArray {

    public static int[] rotate(int[] nums, int k) {

        int size = nums.length;
        int[] newArray = new int[size];

        for (int i = 0; i < size; i++) {
            if (i < k) {
                newArray[i] = nums[size-i-1];
            } else {
                newArray[i] = nums[i-k];
            }
        }

        return newArray;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;

        //solution 1
        nums = rotate(nums, k);

        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}