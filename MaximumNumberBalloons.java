public class MaximumNumberBalloons {
    
    static int maxNumberOfBalloons(String text) {

        int[] charCounts = new int[26];
        for (char c : text.toCharArray()) {
            charCounts[c - 'a']++;
        }

        int min = charCounts[1]; //b
        min = Math.min(min, charCounts[0]); //a
        min = Math.min(min, charCounts[11] / 2); //ll
        min = Math.min(min, charCounts[14] / 2); //o
        min = Math.min(min, charCounts[13]); //n

        return min;
    }

    public static void main(String[] args) {
        String text = "loonbalxballpoon";
        System.out.println(maxNumberOfBalloons(text));
    }
}
