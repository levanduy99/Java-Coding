public class FindWordsFormedByCharacters {
    
    static int countCharacters(String[] words, String chars) {

        int countCharacters = 0;

        for (String word : words) {
            if (isGoodString(word, chars)) {
                countCharacters += word.length();
            }
        }

        return countCharacters;
    }

    static boolean isGoodString(String word, String chars) {

        int[] letters = new int[26];

        for (char c : chars.toCharArray()) {
            letters[c - 'a']++;
        }

        for (char c : word.toCharArray()) {
            letters[c - 'a']--;
            if (letters[c - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String[] words = {"cat", "bt", "hat", "tree"};
        String chars = "atach";
        System.out.println(countCharacters(words, chars));
    }
}
