public class ClimbStairs {
    
    /*solution 
    n = 1 --> 1 
    n = 2 --> 2
    n = 3 --> 3
    n = 4 --> 5
    n = 5 --> 8
    n = 6 --> 13
    ... => fibonacci
    */

    //solution 1
    public static int climbStairs(int n) {

        if (n <= 1) {
            return n;
        }

        int number1 = 1;
        int number2 = 1;
        int countWays = 0;

        for (int i = 0; i < n; i++) {
            countWays = number1 + number2;
            number1 = number2;
            number2 = countWays; 
        }

        return countWays;
    }

    //solution 2
    public static int climbingStairs(int n) {
        if (n <= 1) {
            return n;
        }
        return climbStairs(n - 1) + climbStairs(n -2);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(climbingStairs(n));
    }
}
