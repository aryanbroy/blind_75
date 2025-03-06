public class q424 {
  public static void main(String args[]) {
    System.out.println("hello");
  }
  public int characterReplacement(String s, int k) {
    int maxOcc = 0;
    int left = 0;
    int right = 0;
    int[] freq = new int[26];
    int maxLength = 0;

    while (right < s.length() && left <= right) {

        freq[s.charAt(right) - 'A'] += 1;
        maxOcc = Math.max(maxOcc, freq[s.charAt(right) - 'A']);
        int windowSize = right - left + 1;

        while (windowSize - maxOcc > k) {
            freq[s.charAt(left) - 'A'] -= 1;
            windowSize--;
            left++;
        }

        maxLength = Math.max(maxLength, windowSize);
        right++;
    }

    return maxLength;
  }
}
