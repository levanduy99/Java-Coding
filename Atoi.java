public class Atoi {
    
    public static int myAtoi(String s) {

        s = s.replace(" ", "");
        boolean isPositive = true;

        int i = 0;
        char firstC = s.charAt(i);

        if (!Character.isDigit(firstC)) {
            if (firstC == '-') {
                isPositive = false;
                i++;
            } else if (firstC == '+') {
                isPositive = true;
                i++;
            } else {
                return 0;
            }
        }

        String numberStr = "";
        while (i < s.length()) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                numberStr = numberStr + c;
            } else {
                break;
            }
            i++;
        }

        if (!numberStr.isEmpty()) {
            try {
                int number = Integer.parseInt(numberStr);
                return isPositive ? number : number*(-1);
            } catch (Exception e) {
                return isPositive ? (int) Math.pow(2, 31) - 1 : (int) Math.pow(2, 31)*(-1);
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        String s = "-91283472332";
        System.out.println(myAtoi(s));
    }
}
