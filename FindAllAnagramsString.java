import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramsString {

    static List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();
        int[] charCounts = new int[26];

        for (char c : p.toCharArray()) {
            charCounts[c - 'a']++;
        }

        int left = 0, right = 0;
        int count = p.length();

        while (right < s.length()) {
            if (charCounts[s.charAt(right++) - 'a']-- >= 1) {
                count--;
            }
            if (count == 0) {
                result.add(left);
            }
            if (right - left == p.length() && charCounts[s.charAt(left++) - 'a']++ >= 0) {
                count++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd", p = "abc";
        System.out.println(findAnagrams(s, p));
    }
}
