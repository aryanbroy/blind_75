import java.util.*;

public class q57 {
    public static void main(String args[]) {
    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        List<int[]> res = new ArrayList<>();

        if (n < 1) {
            res.add(newInterval);
            return res.toArray(new int[res.size()][]);
        }

        int i = 0;

        while (i < n && intervals[i][1] < newInterval[0]) {
            res.add(intervals[i]);
            i++;
        }

        int[] newInv = new int[2];
        newInv[0] = newInterval[0];
        newInv[1] = newInterval[1];

        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInv[0] = Math.min(newInv[0], intervals[i][0]);
            newInv[1] = Math.max(newInv[1], intervals[i][1]);
            i++;
        }

        res.add(newInv);

        while (i < n) {
            res.add(intervals[i]);
            i++;
        }

        return res.toArray(new int[res.size()][]);
    }
}