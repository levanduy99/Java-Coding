public class ReverseString {
    
    public static void reverseString(char[] s) {
        int size = s.length;
        for (int i = 0; i < size/2 ; i++) {
            char temp = s[i];
            s[i] = s[size - i - 1];
            s[size - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        //driver code
        reverseString(s);
        for (char c : s) {
            System.out.print(c + " ");
        }
    }
}
