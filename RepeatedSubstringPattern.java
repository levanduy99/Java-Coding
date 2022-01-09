public class RepeatedSubstringPattern {
 
    static boolean repeatedSubstringPattern(String s) {

        int size = s.length();

        for (int i = size/2; i > 0; i--) {
            if (size % i == 0) {
                String subString = s.substring(0, i);
                String temp = "";
                for (int j = 0; j < size/i; j++) {
                    temp = temp + subString;
                }
                if (s.equals(temp)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String s = "abcabcabcabc";
        System.out.println(repeatedSubstringPattern(s));
    }
}
