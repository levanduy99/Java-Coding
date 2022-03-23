public class TESTPhuongTrang {
    
    //case NOT set `*`
    public static boolean checkValid(String s) {

        int open = 0;
        int close = 0;

        for(char c : s.toCharArray()) {
            if (c == '(') {
                open += 1;
            }
            else if (c == ')') {
                close += 1;
                if (open < close) {
                    return false;
                }
            }
        }

        if (open == close) {
            return true;
        }

        return false;
    }

    //case 2 set `*`
    public static boolean checkValid1(String s) {

        int open = 0;
        int close = 0;
        int star = 0;

        for(char c : s.toCharArray()) {
            if (c == '*') {
                star += 1;
            }
            else if (c == '(') {
                open += 1;
            }
            else if (c == ')') {
                close += 1;
                if (open + star < close) {
                    return false;
                }
            }
        }

        if (open == close) {
            return true;
        } 
        else if (open + star == close || open == close + star) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        //case NOT set `*`
        System.out.println(checkValid("(abc))("));
        //case 2 set `*`
        // System.out.println(checkValid1("((*))"));
    }
}
