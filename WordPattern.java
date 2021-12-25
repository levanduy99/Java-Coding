import java.util.HashMap;

class WordPattern {

    static boolean wordPattern(String pattern, String s) {

        if (s.split(" ").length != pattern.length()) {
            return false;
        }

        HashMap<Character, String> map = new HashMap<>();
        int index = 0;

        for (String word : s.split(" ")) {
            char c = pattern.charAt(index);
            if (map.containsKey(c)) {
                if (!word.equals(map.get(c))) {
                    return false;
                }
            } else {
                if (map.containsValue(word)) {
                    return false;
                }
                map.put(c, word);
            }
            index++;
        }

        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog dog dog dog";
        System.out.println(wordPattern(pattern, s));
    }
}