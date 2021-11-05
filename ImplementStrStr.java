public class ImplementStrStr {
    
    //solution 1
    public static int strStr1(String haystack, String needle) {

        if (!haystack.contains(needle)) {
            return -1;
        }

        if (haystack.equals(needle)) {
            return 0;
        }
        
        String[] haystackList = haystack.split(needle);

        return haystackList[0].length();
    }

    //solution 2
    public static int strStr(String haystack, String needle) {

        if (needle.isEmpty() || haystack.equals(needle)) {
            return 0;
        }

        int sizeHaystack = haystack.length();
        int sizeNeedle = needle.length();

        if (sizeHaystack < sizeNeedle) {
            return -1;
        }

        for (int i = 0; i <= sizeHaystack - sizeNeedle; i++) {
            int count = 0;
            for (int j = 0; j < sizeNeedle; j++) {
                if (needle.charAt(j) != haystack.charAt(i + j)) {
                    break;
                } else {
                    count ++;
                }
            }
            if (count == sizeNeedle) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        System.out.println(strStr(haystack, needle));
    }
}
