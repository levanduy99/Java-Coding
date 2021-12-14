class LongPressedName {

    static boolean isLongPressedName(String name, String typed) {

        // if (name.length() > typed.length()) {
        //     return false;
        // } 

        // if (name.length() == typed.length()) {
        //     return true;
        // }

        int i = 0;
        int j = 0;

        while (j < typed.length()) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
            } else if (j == 0 || typed.charAt(j) != typed.charAt(j - 1)) {
                return false;
            }
            j++;
        }

        return i == name.length();
    }

    public static void main(String[] args) {
        String name = "alex";
        String typed = "aaleex";
        System.out.println(isLongPressedName(name, typed));
    }
}