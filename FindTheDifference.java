class FindTheDifference {
    
    static char findTheDifference(String s, String t) {

        int[] charCounts = new int[26];
        
        for (char c : s.toCharArray()) {
            charCounts[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            charCounts[c - 'a']--;
            if (charCounts[c - 'a'] < 0) {
                return c;
            }
        }

        return ' ';
    }
    
    public static void main(String[] args) {
        String s = "abcd", t = "abcde";
        System.out.println(findTheDifference(s, t));
    }
}