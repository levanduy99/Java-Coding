class PlusOne {

    //solution 1
    public static int[] plusOne(int[] digits) {

        int size = digits.length;
        int[] result = new int[size + 1];
        
        for (int i = size - 1; i >= 0; i--) {
            int sum = digits[i] + 1;
            if (sum == 10) {
                result[i + 1] = 0;
                result[i] = 1;
            } else {
                result[i + 1] = sum;
            }
        }

        if (result[0] == 0) {
            for (int i = 0; i < size; i++) {
                digits[i] = result[i + 1];
            }
            return digits;
        }

        return result;
    }

    //solution 2
    public static int[] plus1(int[] digits) {
        int size = digits.length;

        for (int i = size - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[size + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        int[] digits = {9, 9};    
        int[] result = plusOne(digits);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}