package q8;

public class q8 {
    public static void main(String args[]) {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int res = maxArea(height);
        System.out.println(res);
    }

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int max = 0;

        while (left < right) {
            int area = (right - left) * Math.min(height[left], height[right]);

            if (area > max) {
                max = area;
            }

            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }

        return max;
    }
}