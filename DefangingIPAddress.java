class DefangingIPAddress {

    //solution 1
    static String defangIPaddr(String address) {

        String result = "";

        for (char c : address.toCharArray()) {
            if (c == '.') {
                result += "[.]";
            } else {
                result += c;
            }
        }

        return result;
    }  

    //solution 2
    /**
     * address.replaceAll("\\.", "[.]"); 
     * */

    public static void main(String[] args) {
        String address = "255.100.50.0";
        System.out.println(defangIPaddr(address));
    }
}