public class RemoveAllAdjacentDuplicates {
    
    //solution 1
    static String removeDuplicates1(String s) {

        int index = 0;
        while (index < s.length() - 1) {
            if (s.charAt(index) == s.charAt(index + 1)) {
                s = s.substring(0, index) + s.substring(index + 2);
                if (index != 0) {
                    index --;
                }
            } else {
                index++;
            }
        }

        return s;
    }

    //solution 2
    static String removeDuplicates(String s) {

        char[] stack = new char[s.length()];
        int index = 0;
        
        for (int i = 0; i < s.length(); i++) {

            char currentChar = s.charAt(i);

            if (index > 0 && stack[index - 1] == currentChar) {
                index--;
            } else {
                stack[index] = currentChar;
                index++;
            }
        }

        return new String(stack, 0, index);
    }

    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(removeDuplicates(s));
    }
}
