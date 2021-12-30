import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicatesArray {
    
    //solution 1
    static List<Integer> findDuplicates1(int[] nums) {

        Arrays.sort(nums);
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                result.add(nums[i]);
            }
        }

        return result;
    }

    //solution 2
    static List<Integer> findDuplicates(int[] nums) {

        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                result.add(index + 1);
            }
            nums[index] = -nums[index];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDuplicates(nums));
    }
}
