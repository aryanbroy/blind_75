public class q190 {
    public static void main(String args[]) {
    }

    public static int reverseBits(int n) {
        int result = 0;

        for (int i = 0; i < 32; i++) {
            int rightMost = n & 1;
            n >>= 1;
            result <<= 1;
            result |= rightMost;
        }

        return result;
    }
}
