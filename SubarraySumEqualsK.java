import java.util.HashMap;

public class SubarraySumEqualsK {
    
    //solution 1
    static int subarraySum1(int[] nums, int k) {

        int index = 0;
        int count = 0; 

        while (index < nums.length) {
            int sum = 0;
            for (int i = index; i < nums.length; i++) {
                sum = sum + nums[i];
                if (sum == k) {
                    count++;
                }
            }
            index++;
        }

        return count;
    }

    //solution 2
    static int subarraySum(int[] nums, int k) {

        int count = 0; 
        HashMap<Integer, Integer> sumArray = new HashMap<>();
        sumArray.put(0, 1);
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sumArray.containsKey(sum - k)) {
                count += sumArray.get(sum - k);
            }

            sumArray.put(sum, sumArray.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {3 ,1, 3, -1, 0};
        System.out.println(subarraySum(nums, 0));
    }
}
