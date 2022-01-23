import java.util.Arrays;

public class BoatsToSavePeople {

    static int numRescueBoats(int[] people, int limit) {

        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;
        int count = 0;

        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                left++;
                right--;
            } else {
                right--;
            }
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] people = {3, 2, 2, 1};
        System.out.println(numRescueBoats(people, 3));
    }
}
