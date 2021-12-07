import java.util.HashMap;

class FruitIntoBaskets {

    static int totalFruit(int[] fruits) {

        if (fruits == null || fruits.length == 0) {
            return 0;
        }

        int max = 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;

        while (j < fruits.length) {
            if (map.size() <= 2) {
                map.put(fruits[j], j++);
            }
            if (map.size() > 2) {
                int min = fruits.length - 1;

            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] fruits = {3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4};
        System.out.println(totalFruit(fruits));
    }
}