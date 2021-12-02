public class MaxConsecutiveOnes {
    
    static int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int maxConsecutiveOnes = 0;

        for (int num : nums) {
            if (num == 1) {
                count++;
                maxConsecutiveOnes = Math.max(count, maxConsecutiveOnes);
            } else {
                count = 0;
            }
        }

        return maxConsecutiveOnes;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1}; 
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
