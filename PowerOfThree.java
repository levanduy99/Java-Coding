public class PowerOfThree {
    
    public static boolean isPowerOfThree(int n) {

        while (n > 1) {
            if (n % 3 == 0) {
                n = n / 3;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(81));
    }
}
