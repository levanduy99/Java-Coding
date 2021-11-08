public class LongestCommonPrefix {
    
    //solution 1
    public static String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) {
            return "";
        }

        if (strs.length == 1) {
            return strs[0];
        }

        String commonPrefix = "";
        
        for (int i = 0; i < strs[0].length(); i++) {
            boolean isCommon = true;
            for (int j = 1; j < strs.length; j++) {
                try {
                    if (strs[0].charAt(i) != strs[j].charAt(i)) {
                        isCommon = false;
                    }
                } catch (Exception e) {
                    isCommon = false;
                    break;
                }
            }
            if (isCommon) {
                commonPrefix = commonPrefix + strs[0].charAt(i); 
            }
        }

        return commonPrefix;
    }

    //solution 2
    public static String commonPrefix(String[] strs) {

        if (strs.length == 0) {
            return "";
        }

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = {"geeksforgeeks", "geeks", "geek", "geezer"};
        // System.out.println(longestCommonPrefix(strs));
        System.out.println(commonPrefix(strs));
    }
}
