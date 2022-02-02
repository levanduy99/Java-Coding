public class NumberComplement {

    //solution 1
    static int findComplement1(int num) {

        String binaryNumber = "";

        while (num > 0) {
            int bit = num % 2;
            num = num / 2;
            binaryNumber = bit + binaryNumber;
        }

        int result = 0;
        int index = binaryNumber.length() - 1;
        System.out.println(binaryNumber);
        for (int i = index; i >= 0; i--) {
            if (binaryNumber.charAt(i) == '0') {
                result += Math.pow(2, index - i);
            }
        }

        return result;
    }

    //solution 2
    static int findComplement(int num) {

        int result = 0;
        int power = 1;

        while (num > 0) {
            result += (num % 2 ^ 1) * power;
            power <<= 1;
            num >>= 1;
        }

        return result;
    }    

    public static void main(String[] args) {
        System.out.println(findComplement(2));
    }
}
