public class q53.java {
    public stativ void main(String args[]){}
    public static int maxSubArray(int[] nums) {
      int currentSum = nums[0];
      int maxSum = nums[0];

      for (int i = 1; i<nums.length; i++) {
        currentSum = Math.max(currentSum, nums[i] + currentSum);
        maxSum = Math.max(maxSum, currentSum);
      }
      return maxSum;
    }
}
