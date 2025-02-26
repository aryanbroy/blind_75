public class q10 {
    public static void main(String args[]) {
        int[] nums = { 3, 0, 1 };
        int res = missingNumber(nums);
        System.out.println(res);
    }

    public static int missingNumber(int[] nums) {
        int actualSum = 0;

        for (int i = 0; i <= nums.length; i++) {
            actualSum += i;
        }

        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        System.out.println(actualSum);
        System.out.println(sum);

        return actualSum - sum;
    }
}