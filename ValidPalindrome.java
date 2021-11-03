public class ValidPalindrome {

    //solution 1
    public static boolean isPalindrome(String s) {

        /*Ascii 2:
            + a -> z is 97 -> 122
            + 0 -> 9 is 48 -> 57
        */

        s = s.toLowerCase();
        String reverseStr = "";
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            int charInt = s.charAt(i);
            //can using Character.isLetterOrDigit() ?
            if ((charInt >= 97 && charInt <= 122) || (charInt >= 48 && charInt <= 57)) {
                str = str + s.charAt(i);
                reverseStr = s.charAt(i) + reverseStr;
            }
        }

        if (str.equals(reverseStr)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) { 
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
