public class ShortestDistanceCharacter {
    
    static int[] shortestToChar(String s, char c) {

        int[] answer = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                answer[i] = 0;
                int index = i - 1;
                int distance = 1;
                while (index >= 0 && answer[index] == Integer.MAX_VALUE) {
                    answer[index] = distance;
                    distance++;
                    index--;
                }
            } else {
                answer[i] = Integer.MAX_VALUE;
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                int index = i + 1;
                int distance = 1;
                while (index < s.length() && distance < answer[index]) {
                    answer[index] = distance;
                    distance++;
                    index++;
                } 
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String s = "aaba";
        char c = 'b';
        for (int number : shortestToChar(s, c)) {
            System.out.print(number + " ");
        }
    }
}
