import java.util.*;

public class q11 {
    public static void main(String args[]) {
        // int[] nums = { 1, -1, -1, 0 };
        // List<List<Integer>> res = threeSum(nums);
        // System.out.println(res);

        // int[] nums2 = { 0, 0, 0, 0 };
        // res = threeSum(nums2);
        // System.out.println(res);

        int[] nums3 = { -2, 0, 0, 2, 2 };
        List<List<Integer>> res = threeSum(nums3);
        // res = threeSum(nums3);
        System.out.println(res);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            int currentElem = nums[i];

            if (i > 0 && nums[i - 1] == currentElem) {
                continue;
            }

            while (left < right) {
                int sum = currentElem + nums[left] + nums[right];
                if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    list.add(Arrays.asList(currentElem, nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                }
            }
        }
        return list;
    }
}
