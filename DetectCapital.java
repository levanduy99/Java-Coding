class DetectCapital {
    
    static boolean detectCapitalUse(String word) {

        int countCharUpperCase = 0;

        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c)) {
                countCharUpperCase++;
            }
        }

        return countCharUpperCase == word.length() || countCharUpperCase == 0 ||
            (countCharUpperCase == 1 && Character.isUpperCase(word.charAt(0)));
    }
    
    public static void main(String[] args) {
        System.out.println(detectCapitalUse("USA"));
    }
}