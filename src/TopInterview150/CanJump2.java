package TopInterview150;

public class CanJump2 {
    public static void main(String[] args) {
        int[] nums = {8};
        System.out.println("expected 0; actual " + canJump(nums));
    }

    // assumption: it's guaranteed you can reach the end index
    public static int canJump(int[] nums) {
        int jumps = 0, currEnd = 0, currFarthest = 0;

        for (int i = 0; i < nums.length - 1; i ++) {

            currFarthest = Math.max(currFarthest, i + nums[i]);

            if (i == currEnd) {
                currEnd = currFarthest;
                jumps ++;
            }
        }
        return jumps;
    }
}
