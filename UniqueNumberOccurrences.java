import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberOccurrences {
    
    static boolean uniqueOccurrences(int[] array) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int number : array) {
            map.put(number, map.getOrDefault(number, 0) + 1);
        }

        HashSet<Integer> uniqueValues = new HashSet<>(map.values());

        return map.size() == uniqueValues.size();
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 1, 1, 3};
        System.out.println(uniqueOccurrences(array));
    }
}
