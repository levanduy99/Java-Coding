public class ReverseInteger {
    
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

    public static void main(String[] args) {
        int x = -12345;
        System.out.println(reverse(x));
    }
}
