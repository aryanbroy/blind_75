import java.util.*;
// import java.util.stream.*;

public class q56 {
    public static void main(String args[]) {
    }

    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return new int[0][];
        }

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int[] lastInterval = intervals[0];
        List<int[]> lst = new ArrayList<>();

        for (int[] interval : intervals) {
            if (lst.isEmpty()) {
                lst.add(interval);
                continue;
            }
            if (interval[0] <= lastInterval[1]) {
                lastInterval[1] = Math.max(lastInterval[1], interval[1]);
            } else {
                lastInterval = interval;
                lst.add(lastInterval);
            }
        }
        return lst.toArray(new int[lst.size()][]);
    }
}
