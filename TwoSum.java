import java.util.HashMap;

public class TwoSum {

    //solution 1
    public static int[] twoSum1(int[] nums, int target) {
        int[] result = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j ++) {

                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }

        return result;
    }

    //solution 2
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int remains = target - nums[i];
            if (map.containsKey(remains)) {
                result[1] = i;
                result[0] = map.get(remains);
                return result;
            } else {
                map.put(nums[i], i);
            }
        }

        return null;
    }
    
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] result = twoSum(nums, 9);
        
        System.out.println(result[0] + " | " + result[1]);
    }
}
