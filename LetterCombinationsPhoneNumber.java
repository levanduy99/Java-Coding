import java.util.LinkedList;
import java.util.List;

public class LetterCombinationsPhoneNumber {
    
    static List<String> letterCombinations(String digits) {

        if (digits == null || digits.length() == 0) {
            return null;
        }

        String[] charMap = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        LinkedList<String> result = new LinkedList<>();
        result.add("");

        for (int i = 0; i < digits.length(); i++) {
            int number = Character.getNumericValue(digits.charAt(i));
            while (result.peek().length() == i) {
                String x = result.remove();
                for (char s : charMap[number].toCharArray()) {
                    result.add(x + s);
                }
            }

        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("293"));
    }
}
