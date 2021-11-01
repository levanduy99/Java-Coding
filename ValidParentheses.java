class ValidParentheses {

    //solution 1
    public static boolean isValid(String s) {

        int size = s.length();

        if (size % 2 != 0) {
            return false;
        }

        if (isTheSameBracket(s.charAt(0), s.charAt(1))) {
            for (int i = 0; i < size - 1; i = i + 2) {
                if (!isTheSameBracket(s.charAt(i), s.charAt(i+1))) {
                    return false;
                }
            }  
        } else {
            for (int i = 0; i < size/2; i++) {
                if (!isTheSameBracket(s.charAt(i), s.charAt(size - i - 1))) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean isTheSameBracket(char bracketOpen, char bracketClose) {
        if (bracketOpen == '(' && bracketClose == ')') {
            return true;
        } else if (bracketOpen == '{' && bracketClose == '}') {
            return true;
        } else if (bracketOpen == '[' && bracketClose == ']') {
            return true;
        } else {
            return false; 
        }
    }

    public static void main(String[] args) {
        String s = "([)]";
        System.out.println(isValid(s));
    }
}