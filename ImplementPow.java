public class ImplementPow {

    public static double myPow(double x, int n) {

        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            x = 1 / x;
            n = -n;
        }

        double result = x;

        for (int i = 0; i < n - 1; i++) {
            result = result * x;
        }

        return result;
    }

    public static void main(String[] args) {
        double x = -2;
        int n = 3;
        System.out.println(myPow(x, n));
    }
}
