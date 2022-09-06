import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionOfTwoLists {

    private static ArrayList<Integer> intersectionOfTwoLists(int[] array, int[] otherArray) {

        HashSet<Integer> hashSet = new HashSet<>();
        for (Integer number : array) {
            hashSet.add(number);
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (Integer number : otherArray) {
            if (hashSet.contains(number)) {
                result.add(number);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 54, 56, 6, 12};
        int[] otherArray = {3, 1, 2, 10};
        System.out.println(intersectionOfTwoLists(array, otherArray));
    }
}
