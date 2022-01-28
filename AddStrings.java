class AddStrings {

    static String addStrings(String num1, String num2) {

        String result = "";
        int carry = 0;
        int index1 = num1.length() - 1, index2 = num2.length() - 1;

        while (index1 >= 0 || index2 >= 0) {
            int sum = carry;
            if (index1 >= 0) {
                sum += num1.charAt(index1--) - '0';
            } 
            if (index2 >= 0) {
                sum += num2.charAt(index2--) - '0';
            }
            result = sum%10 + result;
            carry = sum/10;
        }

        return result;
    }

    public static void main(String[] args) {
        String num1 = "17", num2 = "123";
        System.out.println(addStrings(num1, num2));
    }
}