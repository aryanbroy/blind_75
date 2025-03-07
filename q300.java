public class q300 {
  public int lengthOfLIS(int[] nums) {
    ArrayList<Integer> sub = new ArrayList<>();

    for (int num : nums) {
        if (sub.isEmpty() || num > sub.get(sub.size() - 1)) {
            sub.add(num);
        } else {
            int index = binarySearch(sub, num);
            sub.set(index, num);
        }
    }
    return sub.size();
  }

  public int binarySearch(ArrayList<Integer> arr, int target) {
    int low = 0;
    int high = arr.size() - 1;

    while (low <= high) {
        int mid = (low + high) / 2;

        if (arr.get(mid) < target) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
    return low;
  }
}
