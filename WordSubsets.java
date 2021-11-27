import java.util.ArrayList;
import java.util.List;

public class WordSubsets {
    
    //solution 1
    static List<String> wordSubsets(String[] words1, String[] words2) {

        List<String> wordSubsetList = new ArrayList<>();

        for (String word1 : words1) {
            wordSubsetList.add(word1);
            for (String word2 : words2) {
                String temp = word1;
                if (!isSubset(temp, word2)) {
                    wordSubsetList.remove(word1);
                    break;
                } 
            }
        }

        return wordSubsetList;
    }

    public static boolean isSubset(String a, String b) {

        for (char c : b.toCharArray()) {
            if (a.indexOf(c) == -1) {
                return false;
            } else {
                a = a.replaceFirst(c + "", "");
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String[] words1 = {"amazon", "apple", "facebook", "google", "leetcode"};
        String[] words2 = {"ec","oc","ceo"};
        System.out.println(wordSubsets(words1, words2));
    }
}
