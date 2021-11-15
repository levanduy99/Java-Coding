public class AddBinary {
    
    //solution 1
    public static String addBinary1(String a, String b) {

        String result = "";
        int indexA = a.length() - 1;
        int indexB = b.length() - 1;
        char carry = '0';

        while(indexA >= 0 && indexB >= 0) {
            int calculateXor = a.charAt(indexA) ^ b.charAt(indexB);
            if (carry == '0') {
                if (calculateXor == 1) {
                    result = '1' + result;
                } else if (calculateXor == 0 && a.charAt(indexA) == '1') {
                    result = '0' + result;
                    carry = '1';
                } else {
                    result = '0' + result;
                }
            } else {
                if (calculateXor == 1) {
                    result = '0' + result;
                    carry = '1';
                } else if (calculateXor == 0 && a.charAt(indexA) == '1') {
                    result = '1' + result;
                    carry = '1';
                } else {
                    result = '1' + result;
                    carry = '0';
                }
            }
            indexA--;
            indexB--;
        }

        while (indexA >= 0) {
            if (carry == '1') {
                int calculateXor = a.charAt(indexA) ^ '1';
                if (calculateXor == 1) {
                    result = '1' + result;
                    carry = '0';
                } else if (calculateXor == 0 && a.charAt(indexA) == '1') {
                    result = '0' + result;
                    carry = '1';
                } else {
                    result = '0' + result;
                    carry = '0';
                }
            } else {
                result = a.charAt(indexA) + result;
            }
            indexA--;
        }

        while (indexB >= 0) {
            if (carry == '1') {
                int calculateXor = b.charAt(indexB) ^ '1';
                if (calculateXor == 1) {
                    result = '1' + result;
                    carry = '0';
                } else if (calculateXor == 0 && b.charAt(indexB) == '1') {
                    result = '0' + result;
                    carry = '1';
                } else {
                    result = '0' + result;
                    carry = '0';
                }
            } else {
                result = b.charAt(indexB) + result;
            }
            indexB--;
        }

        if (carry == '1') {
            result = '1' + result;
        }

        return result;
    }

    //solution 2
    public static String addBinary(String a, String b) {

        String result = "";
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }

            result = sum%2 + result;
            carry = sum/2;
        }

        if (carry > 0) {
            result = 1 + result;
        }

        return result;
    }

    public static void main(String[] args) {
        String a = "1010";
        String b = "11";
        System.out.println(addBinary(a, b));
    }
}
