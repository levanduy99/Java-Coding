public class ProductOfArrayExceptSelf {

    static int[] productExceptSelf(int[] nums) {

        int size = nums.length;
        int[] answer = new int[size];
        answer[0] = 1; // 1 5 10 30 - 5 2 3 4

        for (int i = 1; i < size; i++) {
            answer[i] = nums[i - 1] * answer[i - 1];
        }

        int r = 1;
        for (int i = size - 1; i >= 0; i--) {
            answer[i] = answer[i] * r;
            r = r * nums[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4 };
        nums = productExceptSelf(nums);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
