import java.util.*;

public class q3 {
    public static void main(String args[]) {
        String s = "abcabcbb";
        int res = lengthOfLongestSubstring(s);
        System.out.println(res);
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }

        if (s.length() == 1) {
            return 1;
        }

        HashSet<Character> hset = new HashSet<>();

        int right = 0;
        int left = 0;
        int ans = 0;

        while (right < s.length()) {
            while (hset.contains(s.charAt(right))) {
                hset.remove(s.charAt(left));
                left++;
            }
            hset.add(s.charAt(right));
            ans = Math.max(ans, right - left + 1);
            right++;
        }
        return ans;
    }
}