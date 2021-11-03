import java.util.HashMap;

public class FirstUniqueCharacter {

    //solution 1
    public static int findFirstUniqueChar(String s) {
        
        int size = s.length();

        for (int i = 0; i < size; i++) {
            String temp = s.replace("" + s.charAt(i), "");
            if (temp.length() == size - 1) {
                return i;
            }
        }

        return -1;
    }

    //solution 2
    public static int firstUniqueChar(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, -1);
            } else {
                map.put(c, i);
            }
        }

        int min = Integer.MAX_VALUE;
        for (char c : map.keySet()){
            if (map.get(c) > -1 && map.get(c) <min) {
                min = map.get(c);
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }

    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqueChar(s));
    }
}
