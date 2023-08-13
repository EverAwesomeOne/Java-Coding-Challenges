package TopInterview150;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
//        int[] nums = {2,2,1,1,1,2,2};
//        System.out.println(majorityElem(nums));

        int[] nums = {6,6,6,7,7};
        System.out.println(majorityElem(nums));
    }

    // assumption: majority elem always exists
    // constraints:
    // n == nums.length
    // 1 <= n <= 5 * 10^4
    // -10^9 <= nums[i] <= 10^9
    public static int majorityElem(int[] nums) {
        // base case: 1 elem
        if (nums.length == 1) {
            return nums[0];
        }

        Arrays.sort(nums);
        int count = 0;
        int tempCount = 1;
        int majority = nums[0];

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                tempCount++;
            }

            else if (nums[i] != nums[i + 1]) {
                if (tempCount > count) {
                    count = tempCount;
                    tempCount = 1;
                    majority = nums[i];
                }
            }
        }

        if (nums[nums.length - 2] == nums[nums.length - 1]) {
            tempCount++;
            if (tempCount > count) {
                majority = nums[nums.length - 1];
            }
        }

        return majority;
    }
}
