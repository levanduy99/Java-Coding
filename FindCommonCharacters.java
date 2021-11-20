import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FindCommonCharacters {

    //solution 1
    public static List<String> commonChars1(String[] words) {

        List<String> result = new ArrayList<>();

        for (char c : words[0].toCharArray()) {
            result.add(c + "");
            for (int i = 1; i < words.length; i++) {
                if (words[i].indexOf(c) == -1) {
                    result.remove(c + "");
                    break;
                } else {
                    words[i] = words[i].replaceFirst(c + "", "");
                }
            }
        }

        return result;
    }

    //solution 2
    public static List<String> commonChars(String[] words) {

        List<String> result = new ArrayList<>();
        int[] minFrequencies = new int[26];
        Arrays.fill(minFrequencies, Integer.MAX_VALUE);

        for (String word : words) {
            int[] charFrequencies = new int[26];

            for (char c : word.toCharArray()) {
                charFrequencies[c - 'a']++;
            }

            for (int i = 0; i < 26; i++) {
                minFrequencies[i] = Math.min(minFrequencies[i], charFrequencies[i]);
            }
        }

        for (int i = 0; i < 26; i++) {
            while (minFrequencies[i] > 0) {
                result.add("" + (char)(i + 'a'));
                minFrequencies[i]--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] words = {"abc", "acc"};
        System.out.println(commonChars(words));
    }
}