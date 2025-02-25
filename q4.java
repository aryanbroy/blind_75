public class q4 {
    public static void main(String args[]) {
        String s = "cbbd";
        String res = longestPalindrome(s);
        System.out.println(res);
    }

    public static String longestPalindrome(String s) {

        String longest = "";
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            int left = i;
            int right = i;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > maxLen) {
                    longest = s.substring(left, right + 1);
                    maxLen = right - left + 1;
                }
                left--;
                right++;
            }

            left = i;
            right = i + 1;

            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > maxLen) {
                    longest = s.substring(left, right + 1);
                    maxLen = right - left + 1;
                }
                left--;
                right++;
            }
        }
        return longest;
    }
}
