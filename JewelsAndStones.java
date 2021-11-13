public class JewelsAndStones {
    
    //solution 1
    public static int numJewelsInStones1(String jewels, String stones) {

        int numJewelsInStones = 0;

        for (char jewel : jewels.toCharArray()) {
            for (char stone : stones.toCharArray()) {
                if (jewel == stone) {
                    numJewelsInStones++;
                }
            }
        }

        return numJewelsInStones;
    }

    //solution 2
    public static int numJewelsInStones(String jewels, String stones) {

        int numJewelsInStones = 0;
    
        for (char stone : stones.toCharArray()) {
            if (jewels.indexOf(stone) > -1) {
                numJewelsInStones++;
            }
        }

        return numJewelsInStones;
    }

    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels, stones));
    }
}
