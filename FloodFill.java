public class FloodFill {
    
    static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image[sr][sc] == newColor) return image;
        fill(image, sr, sc, newColor, image[sr][sc]);
        return image;
    }

    static void fill (int[][] image, int sr, int sc, int newColor, int color) {
        if (sr < 0 || sc < 0 || sr >= image.length|| sc >= image[0].length || image[sr][sc] != color) {
            return;
        }
        image[sr][sc] = newColor;
        fill(image, sr - 1, sc, newColor, color);
        fill(image, sr + 1, sc, newColor, color);
        fill(image, sr, sc - 1, newColor, color);
        fill(image, sr, sc + 1, newColor, color);
    }

    public static void main(String[] args) {
        int[][] images = {
            {1, 1, 1},
            {1, 1, 0},
            {1, 0, 1}
        };
        int[][] image = floodFill(images, 1, 1, 2);
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }
    }
}
