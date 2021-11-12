class ContainerWithMostWater {

    //solution 1
    public static int maxArea1(int[] height) {

        int maxArea = 0;

        for (int i = 0; i < height.length- 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int vertical = height[i];
                if (height[i] > height[j]) {
                    vertical = height[j];
                }
                int area = vertical * (j - 1);
                if (maxArea < area) {
                    maxArea = area;
                }
            }
        }

        return maxArea;
    }

    public static int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                maxArea = Math.max(maxArea, height[left] * (right - left));
                left++;
            } else {
                maxArea = Math.max(maxArea, height[right] * (right - left));
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = {1, 100, 1001, 2, 3, 4, 5};
        System.out.println(maxArea(height));
    }
}