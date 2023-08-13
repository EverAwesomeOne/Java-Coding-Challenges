package TopInterview150;

import java.util.ArrayList;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int k = removeDuplicates(nums);
        System.out.println(k);
    }

    public static int removeDuplicates(int[] nums) {
        ArrayList<Integer> expectedNums = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (expectedNums.isEmpty()) {
                expectedNums.add(nums[i]);
                count++;
            }
            else if (!expectedNums.contains(nums[i])) {
                expectedNums.add(nums[i]);
                nums[count] = expectedNums.get(count);
                count++;
            }
        }

        return expectedNums.size();
    }
}
