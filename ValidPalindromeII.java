public class ValidPalindromeII {

    static boolean validPalindromeII(String s) {

        int l = 0;
        int r = s.length() - 1;

        while (l < r) {

            if (s.charAt(l) != s.charAt(r)) {
                return validPalindrome(s, l + 1, r) || validPalindrome(s, l, r - 1);
            }

            l++;
            r--;
        }

        return false;
    }

    static boolean validPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "eccec";
        System.out.println(validPalindromeII(s));
    }
}
