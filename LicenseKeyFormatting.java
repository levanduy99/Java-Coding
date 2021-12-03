class LicenseKeyFormatting {

    //solution 1
    static String licenseKeyFormatting1(String s, int k) {

        String result = "";
        int count = 1;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != '-') {
                if (count <= k) {
                    result = s.charAt(i) + result;
                    count++;
                } else {
                    result = '-' + result;
                    count = 1;
                    i++;
                }
            }
        }

        return result.toUpperCase();
    }

    //solution 2
    static String licenseKeyFormatting(String s, int k) {

        s = s.toUpperCase();
        s = s.replaceAll("-", "");

        StringBuilder sb = new StringBuilder(s);

        for (int i = s.length() - k; i >= 0; i = i - k) {
            sb.insert(i, "-");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "2-5g-3-J";
        System.out.println(licenseKeyFormatting(s, 2));
    }
}