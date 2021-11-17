class PeakIndexMountainArray {

    //solution 1
    static int peakIndexInMountainArray1(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return i;
            }
        }

        return -1;
    }

    //solution 2
    static int peakIndexMountainArray(int[] arr) {
        
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int middle = left + (right - left)/2;
            if (arr[middle] < arr[middle + 1]) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }

        return right;
    }

    public static void main(String[] args) {
        int[] arr = {24, 69, 100, 99, 79, 78, 67, 36, 26, 19};
        System.out.println(peakIndexMountainArray(arr));
    }
}