public class RotateString {
 
    //solution 1
    static boolean rotateString1(String s, String goal) {

        int size = s.length();

        for (int i = 0; i < size; i++) {
            s = s.charAt(size - 1) + s.substring(0, size - 1);
            if (s.equals(goal)) {
                return true;
            }
        }

        return false;
    }

    //solution 2
    static boolean rotateString(String s, String goal) {

        if (s.length() == goal.length() && (s + s).contains(goal)) {
            return true;
        }

        return false;
    }  
    
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(rotateString(s, goal));
    }
}
