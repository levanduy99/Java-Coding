import java.util.Stack;

public class DecodeString {
    
    static String decodeString(String s) {

        int index = 0;
        String res = "";
        Stack<Integer> counts = new Stack<>();
        Stack<String> result = new Stack<>();


        while (index < s.length()) {
            if (Character.isDigit(s.charAt(index))) {   
                int count = 0;
                while (Character.isDigit(s.charAt(index))) {
                    count = 10 * count + (s.charAt(index) - '0');
                    index++;
                }
                counts.push(count);
            } else if (s.charAt(index) == '[') {
                result.push(res);
                res = "";
                index++;
            } else if (s.charAt(index) == ']') {
                StringBuffer temp = new StringBuffer(result.pop());
                int count = counts.pop();
                for (int i = 0; i < count; i++) {
                    temp.append(res);
                }
                res = temp.toString(); 
                index++;
            } else {
                res += s.charAt(index);
                index++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        System.out.println(decodeString(s));
    }
}
