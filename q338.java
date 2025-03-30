public class q338 {
    public static void main(String[] args) {
        int n = 5;
        int[] res = countBits(n);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    public static int[] countBits(int n) {
        int[] res = new int[n + 1];

        for (int i = 0; i < res.length; i++) {
            res[i] = res[i >> 1] + (i & 1);
        }

        return res;
    }
}
