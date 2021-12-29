import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {
    
    static List<Integer> partitionLabels(String s) {
        List<Integer> result = new ArrayList();
        
        int[] LastIndices = new int[26];
        for (int i = 0; i < s.length(); i++) {
            LastIndices[s.charAt(i) - 'a'] = i;
        }

        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, LastIndices[s.charAt(i) - 'a']);
            if (i == end) {
                result.add(end - start + 1);
                start = end + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "ababcbacadefegdehijhklij";
        System.out.println(partitionLabels(s));
    }
}
