public class ReverseInteger {
    
    //solution 1
    public static int reverse(int x) {

        int absX = Math.abs(x);
        int reverseNumber = 0;

        while (absX > 0) {
            reverseNumber = reverseNumber*10 + absX%10;
            absX = absX/10;
        }

        if (x < 0) {
            return reverseNumber*(-1);
        } else {
            return reverseNumber;
        }
    }

    //solution 2
    public static int reverseInteger(int x) {

        int reversed = 0;
        int pop;

        while (x != 0) {
            pop = x % 10;
            x = x/10;
            reversed = reversed*10 + pop;
        }

        return reversed;
    }

    public static void main(String[] args) {
        int x = -12345;
        System.out.println(reverseInteger(x));
    }
}
