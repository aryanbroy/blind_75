public class q55 {
    public static void main(String args[]) {
        int[] nums = { 3, 2, 1, 0, 4 };
        boolean res = canJump(nums);
        System.out.println(res);
    }

    public static boolean canJump(int[] nums) {
        int maxReach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                return false;
            }
            maxReach = Math.max(maxReach, i + nums[i]);
        }
        return true;
    }
}
