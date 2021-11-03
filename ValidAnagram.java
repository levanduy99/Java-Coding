import java.util.HashSet;

public class ValidAnagram {
    
    //solution 1
    public static boolean isAnagram(String s, String t) {

        int sizeOfS = s.length();
        int sizeOfT = t.length();

        if (sizeOfS != sizeOfT) {
            return false;
        } 

        HashSet<Character> hashSet = new HashSet<>();
        for (int i = 0; i < sizeOfS; i++) {
            hashSet.add(s.charAt(i));
        }

        for (int i = 0; i < sizeOfS; i++) {
            if (hashSet.contains(t.charAt(i))) {
                hashSet.remove(t.charAt(i));
            }
        }

        return hashSet.isEmpty()? true : false;
    }

    //solution 2
    public static boolean isValidAnagram(String s, String t) {

        int sizeOfS = s.length();
        int sizeOfT = t.length();

        if (sizeOfS != sizeOfT) {
            return false;
        }

        int[] counts = new int[26];
        for (int i = 0; i < sizeOfS; i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }

        for (int i : counts) {
            if (i != 0) {
                return false;
            }
        }

            return true;
    }

    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
}
