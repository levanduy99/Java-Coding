import java.util.HashSet;

class UniqueMorseCodeWords {

    static int uniqueMorseRepresentations(String[] words) {

        String[] MORSE = {
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
            "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-",
            "..-","...-",".--","-..-","-.--","--.."
        };

        HashSet<String> uniqueMorseWords = new HashSet<>();

        for (String word : words) {
            String transformation = "";
            for (char c : word.toCharArray()) {
                transformation += MORSE[c - 'a'];
            }
            uniqueMorseWords.add(transformation);
        }
    

        return uniqueMorseWords.size();
    }

    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(words));
    }
}