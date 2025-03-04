public class q20 {
    public static void main(String args[]) {
        int[] arr = { 3, 4, 5, 1, 2 };
        int res = findMin(arr);
        System.out.println(res);
    }

    public static int findMin(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int min = arr[0];

        while (low < high) {
            int mid = (low + high) / 2;
            min = Math.min(arr[mid], min);

            if (arr[mid] > arr[high]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return min;
    }
}
