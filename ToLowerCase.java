public class ToLowerCase {

    // solution 1
    public String lowerCase(String s) {
        return s.toLowerCase();
    }

    // solution 2
    public static String toLowerCase(String s) {
        String result = "";
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result = result + (char)(c + 32);
            } else {
                result = result + c;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "hEllO";
        System.out.println(toLowerCase(s));
    }
}
