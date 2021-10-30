import java.util.HashSet;

public class SingleNumber {

    //solution 1
    public static int singleNumber(int[] nums) {

        int singleNumber = nums[0];

        for (int i = 1; i < nums.length; i++) {
            singleNumber = singleNumber ^ nums[i];
        }

        return singleNumber;
    }

    //solution 2
    public static int findSingleNumber(int[] nums) {

        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashSet.contains(nums[i])) {
                hashSet.remove(nums[i]);
            } else {
                hashSet.add(nums[i]);
            }
        }

        return hashSet.iterator().next();
    }
    
    public static void main(String[] args) {
        int[] nums = {3, 5, 4, 5, 3, 1, 2, 1, 2};
        System.out.println(findSingleNumber(nums));
    }
}
