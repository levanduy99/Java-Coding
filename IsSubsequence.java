public class IsSubsequence {
    
    static boolean isSubsequence(String s, String t) {

        if (s.length() > t.length()) {
            return false;
        }
        
        int indexS = 0;
        int indexT = 0;

        while (indexT < t.length()) {
            if (t.charAt(indexT) == s.charAt(indexS)) {
                indexS++;
                if (indexS == s.length()) {
                    return true;
                }
            }
            indexT++;
        }

        return false;
    }

    public static void main(String[] args) {
        String s = "abc", t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }
}
