public class MergeSort {
    
    //Merges two sub_arrays of arr[]
    //First sub_array is arr[l ... m]
    //Second sub_array is arr[m+1 ... r]
    public static void merge(int[] arr, int l, int m, int r) {
        //Find sizes of two sub_arrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        //Create temp arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        //Copy data to temp arrays
        for (int i = 0; i < n1; i++) {
            L[i] = arr[l+i];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = arr[m + 1 + i];
        }

        //Merge the temp arrays

        //Initial indexes of the first and second sub_arrays
        int i = 0, j = 0;

        //Initial index of merged sub_array array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[i]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        //Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k++] = L[i++];
        }

        //Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k++] = R[j++];
        }
    }

    //Main function that sorts arr[l ... r] using merge()
    public static void sort(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l)/2;

            //Sort first and second halves
            sort(arr, l, m);
            sort(arr, m+1, r);

            merge(arr, l, m, r);
        }
    }

    //Driver code
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 10, 1, 3, 3, 2};
        sort(array, 0, array.length - 1);
        
        //show
        for (Integer number : array) {
            System.out.print(number + " ");
        }
    }
}
