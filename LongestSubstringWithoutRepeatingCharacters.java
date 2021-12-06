import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {

        int start = 0;
        int maxLength = 0;
        HashSet<Character> setWords = new HashSet<>();
        int index = 0;

        while (start < s.length()) {
            if (index < s.length() && !setWords.contains(s.charAt(index))) {
                setWords.add(s.charAt(index));
                index++;
            } else {
                maxLength = Math.max(setWords.size(), maxLength);
                setWords = new HashSet<>();
                start++;
                index = start;
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "aaxcbba";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
