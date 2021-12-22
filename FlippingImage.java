public class FlippingImage {
    
    static int[][] flipAndInvertImage(int[][] image) {
        int size = image.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size/2; j++) {
                int temp = invertNumber(image[i][j]);
                image[i][j] = invertNumber(image[i][size - j - 1]);
                image[i][size - j - 1] = temp;
            }
            if (size % 2 != 0) {
                image[i][size/2] = invertNumber(image[i][size/2]);
            }
        }

        return image;
    }

    static int invertNumber(int number) {
        if (number == 1) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        int[][] image = {
            {1,1,0,0},
            {1,0,0,1},
            {0,1,1,1},
            {1,0,1,0}
        };
        for (int[] array : flipAndInvertImage(image)) {
            for (int number : array) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
