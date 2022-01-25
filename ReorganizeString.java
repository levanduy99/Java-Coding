import java.util.HashMap;
import java.util.PriorityQueue;

public class ReorganizeString {

    static String reorganizeString(String s) {

        HashMap<Character, Integer> counts = new HashMap<>();
        for (char c : s.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> counts.get(b) - counts.get(a));
        maxHeap.addAll(counts.keySet());

        String result = "";

        while (maxHeap.size() > 1) {
            char current = maxHeap.remove();
            char next = maxHeap.remove();
            result = result + current + next;
            counts.put(current, counts.get(current) - 1);
            counts.put(next, counts.get(next) - 1);
            if (counts.get(current) > 0) {
                maxHeap.add(current);
            }
            if (counts.get(next) > 0) {
                maxHeap.add(next);
            }
        }

        if (!maxHeap.isEmpty()) {
            char last = maxHeap.remove();
            if (counts.get(last) > 1) {
                return "";
            }
            result += last;
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "aac";
        System.out.println(reorganizeString(s));
    }
}
