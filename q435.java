public class q435 {
  public static void main(String args[]){}
  public int eraseOverlapIntervals(int[][] intervals) {

    Arrays.sort(arr, (a,b) -> Integer.compare(a[1], b[1]));

    int lastElem = Integer.MIN_VALUE;
    int count = 0;

    for (int[] interval : intervals) {
        if (interval[0] >= lastElem) {
            lastElem = interval[1];
        } else {
            count++;
        }
    }
    return count;
  }
}
