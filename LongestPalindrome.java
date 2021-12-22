import java.util.HashMap;

public class LongestPalindrome {
    
    //solution 1
    static int longestPalindrome1(String s) {

        HashMap<Character,Integer> map = new HashMap<>();
        int longestPalindrome = 0;

        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
    
        int flag = -1;

        for (int count : map.values()) {
            if (count % 2 == 0) {
                longestPalindrome += count;
            } else {
                longestPalindrome += count - 1;
                flag = 0;
            }
        }

        return flag == 0 ? longestPalindrome + 1 : longestPalindrome;
    }

    //solution 2
    static int longestPalindrome(String s) {

        int[] charCounts = new int[128];

        for (char c : s.toCharArray()) {
            charCounts[c]++;
        }

        int result = 0;
        int flag = -1;
        
        for (Integer charCount : charCounts) {
            if (charCount % 2 == 0) {
                result += charCount;
            } else {
                result += charCount - 1;
                flag = 0;
            }
        }

        return flag == 0 ? result + 1 : result;
    }

    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));
    }
}
