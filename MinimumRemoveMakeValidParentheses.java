public class MinimumRemoveMakeValidParentheses {
    
    static String minRemoveToMakeValid(String s) {

        int open = 0;
        String temp = "";

        for (char c : s.toCharArray()) {
            if (c == '(') {
                open++;
            } else if (c == ')') {
                if (open == 0) {
                    continue;
                }
                open--;
            }
            temp += c;
        }

        String result = "";

        for (int i = temp.length() - 1; i >= 0; i--) {
            if (temp.charAt(i) == '(' && open-- > 0) {
                continue;
            }
            result += temp.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "))((";
        System.out.println(minRemoveToMakeValid(s));
    }
}
