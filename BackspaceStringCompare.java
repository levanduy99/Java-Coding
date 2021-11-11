import java.util.Stack;

public class BackspaceStringCompare {

    public static boolean backspaceCompare(String s, String t) {

        s = backspaceString(s);
        t = backspaceString(t);

        return s.equals(t) ? true : false;
    }

    public static String backspaceString(String str) {

        Stack<Character> tempStr = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '#') {
                if (tempStr.size() != 0) {
                    tempStr.pop();
                }
            } else {
                tempStr.add(c);
            }
        }

        return tempStr.toString();
    }
    
    public static void main(String[] args) {
        String s = "####ab#cd#";
        String t = "ad#c";

        System.out.println(backspaceCompare(s, t));
    }
}
