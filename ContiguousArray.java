import java.util.HashMap;

public class ContiguousArray {
    
    static int findMaxLength(int[] nums) {

        HashMap<Integer, Integer> counts = new HashMap<>();
        counts.put(0, -1);
        int count = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count += -1;
            } else {
                count += 1;
            }
            if (counts.containsKey(count)) {
                max = Math.max(max, i - counts.get(count));
            } else {
                counts.put(count, i);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 0, 1, 1, 1, 0};
        System.out.println(findMaxLength(nums));
    }
}
