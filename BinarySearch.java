public class BinarySearch {
    
    // recursive implementation of binary search
    public static int binarySearchRecursive(int[] array, int l, int r, int key) {
        if (l <= r) {
            int m = l + (r - l)/2;
            if (array[m] == key) {
                return m;
            }

            if (array[m] < key) {
                return binarySearchRecursive(array, m + 1, r, key);
            } 
                
            return binarySearchRecursive(array, l, m - 1, key);
        }
        return -1;
    }

    //iterative implement of binary search
    public static int binarySearch(int[] array, int key) {

        int r = array.length - 1;
        int l = 0;

        while (l <= r) {
            int m = l + (r - l)/2;
            if (array[m] == key) {
                return m;
            }
            if (array[m] > key) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        System.out.println(binarySearch(array, 12));
    }
}
