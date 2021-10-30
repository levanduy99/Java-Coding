import java.util.HashMap;

public class Intersection {

    //solution 1
    public static int[] intersection(int[] nums1, int[] nums2) {

        if (nums1.length > nums2.length) {
            return findIntersection(nums1, nums2);
        } else {
            return findIntersection(nums2, nums1);
        }
    }

    public static int[] findIntersection(int[] arrayLarger, int[] arraySmaller) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arraySmaller.length; i++) {
            for (int j = 0; j < arrayLarger.length; j++) {
                if (arraySmaller[i] == arrayLarger[j] && hashMap.get(j) == null) {
                    hashMap.put(j, arrayLarger[j]);
                    break;
                }
            }
        }
        
        int[] arrayResult = new int[hashMap.size()];

        int index = 0;
        for (Integer i : hashMap.keySet()) {
            arrayResult[index++] = hashMap.get(i);
        }

        return arrayResult;
    }

    public static void main(String[] args) {
        int[] nums1 = {5, 6, 7, 8, 8, 9};
        int[] nums2 = {7, 6, 7, 8, 8, 8, 1};

        int[] result = intersection(nums1, nums2);

        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
