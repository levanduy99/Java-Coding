import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumber {
    
    static List<Integer> selfDividingNumbers(int left, int right) {
        
        List<Integer> result = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            if (isSelfDividingNumber(i)) {
                result.add(i);
            }
        }

        return result;
    }

    //solution 1
    static boolean isSelfDividingNumber(int number) {

        int quotient = number;
        
        while (quotient > 0) {
            int divisor = quotient%10;
            if (divisor == 0) {
                return false;
            }
            if (number % divisor != 0) {
                return false;
            }
            quotient = quotient/10;
        }

        return true;
    }

    //solution 2
    static boolean isSelfDividing(int number) {

        for (char c : String.valueOf(number).toCharArray()) {
            if (c == '0' || number % (c - '0') != 0) {
                return false;
            }
        }
    
        return true;
    }

    public static void main(String[] args) {
        int left = 1, right = 22;   
        System.out.println(selfDividingNumbers(left, right));
    }
}
