import java.util.Stack;

public class ReverseOnlyLetters {
    
    //solution 1
    static String reverseOnlyLetters1(String s) {
        int index = s.length() - 1;
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                while (!Character.isLetter(s.charAt(index))) {
                    index--;
                }
                result = result + s.charAt(index--);
            } else {
                result = result + s.charAt(i);
            }
        }

        return result;
    }

    //solution 2
    static String reverseOnlyLetters(String s) {

        String result = "";
        Stack<Character> letters = new Stack<>();

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                letters.push(c);
            }
        }

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                result = result + letters.pop();
            } else {
                result = result + c;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "Test1ng-Leet=code-Q!";
        System.out.println(reverseOnlyLetters(s));
    }
}
