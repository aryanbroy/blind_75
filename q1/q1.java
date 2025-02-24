package q1;

import java.util.*;

public class q1 {
    public static void main(String args[]) {
    }

    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        HashSet<Integer> hset = new HashSet<>();

        for (int num : nums) {
            hset.add(num);
        }

        int maxCon = 1;

        for (int num : hset) {
            if (hset.contains(num - 1)) {
                continue;
            } else {
                int currentNum = num;
                int count = 1;
                while (hset.contains(currentNum + 1)) {
                    currentNum += 1;
                    count++;
                }
                if (count > maxCon) {
                    maxCon = count;
                }
            }
        }
        return maxCon;

    }
}