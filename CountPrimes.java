import java.util.HashSet;

public class CountPrimes {

    // solution 1
    public static int countPrimes(int n) {

        int count = 0;

        if (n < 2) {
            return count;
        }

        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }

        return count;
    }

    public static boolean isPrime(int number) {

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    // solution 2
    public static int countPrime(int n) {

        if (n < 2) {
            return 0;
        }

        HashSet<Integer> notPrimes = new HashSet<>();

        for (int i = 2; i * i < n; i++) {
            for (int j = i; j * i < n; j++) {
                int number = i * j;
                if (!notPrimes.contains(number)) {
                    notPrimes.add(number);
                }
            }
        }

        return n - 2 - notPrimes.size();
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(countPrimes(n));
        System.out.println(countPrime(n));
    }
}
