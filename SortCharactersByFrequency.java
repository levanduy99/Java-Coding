import java.util.HashMap;
import java.util.PriorityQueue;

public class SortCharactersByFrequency {

    static String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Character> maxHeap = new PriorityQueue<>();
        maxHeap.addAll(map.keySet());

        String result = "";
        while (!maxHeap.isEmpty()) {
            char c = maxHeap.remove();
            for (int i = 0; i < map.get(c); i++) {
                result += c;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }
}
