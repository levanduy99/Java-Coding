class BinaryNumberWithAlternatingBits {

    //solution 1
    static boolean hasAlternatingBits1(int n) {

        int bit0 = n % 2;
        n = n / 2;

        while (n > 0) {
            int bit1 = n % 2;
            n = n / 2;
            if (bit0 == bit1) {
                return false;
            }
            bit0 = bit1;
        }

        return true;
    }

    //solution 2
    static boolean hasAlternatingBits(int n) {

        String bits = Integer.toBinaryString(n);
        for (int i = 0; i < bits.length() - 1; i++) {
            if (bits.charAt(i) == bits.charAt(i + 1)) {
                return false;
            }
        }

        return true;
    }    

    public static void main(String[] args) {
        System.out.println(hasAlternatingBits(2));
    }
}