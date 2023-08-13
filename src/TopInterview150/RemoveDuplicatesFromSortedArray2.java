package TopInterview150;

public class RemoveDuplicatesFromSortedArray2 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int k = removeDuplicates(nums);
        System.out.println(k);
    }

    public static int removeDuplicates(int[] nums) {
        // base case empty
        if (nums.length == 0){
            return 0;
        }

        // base case length 1
        else if (nums.length == 1) {
            return 1;
        }

        // else length >= 2
        int max = 1, index = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1] && max == 1) {
                max++;
                nums[index++] = nums[i];
            }
            else if (nums[i] != nums[i + 1]) {
                max = 1;
                nums[index++] = nums[i];
            }
            // else curr and next match and max > 1; keep iterating
        }
        nums[index++] = nums[nums.length - 1];

        return index;
    }
}
