import java.util.Arrays;

public class ArrayPartitionI {
    
    static int arrayPairSum(int[] nums) {

        Arrays.sort(nums);
        int pairsSum = 0;

        for (int i = 0; i < nums.length; i = i + 2) {
            pairsSum = pairsSum + nums[i];
        }

        return pairsSum;
    }

    public static void main(String[] args) {
        int[] nums = {6, 2, 6, 5, 1, 2};
        System.out.println(arrayPairSum(nums));
    }
}
