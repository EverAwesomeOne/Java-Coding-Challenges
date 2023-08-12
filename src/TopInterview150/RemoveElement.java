package TopInterview150;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = removeElement(nums, 3);
        System.out.println();
        System.out.println(val);
    }

    public static int removeElement(int[] nums, int val) {
        int notVal = 0;
        int[] temp = new int[nums.length];
        int backend = nums.length - 1;
        int frontend = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                temp[backend] = nums[i];
                backend--;
            } else {
                temp[frontend] = nums[i];
                frontend++;
                notVal++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }

        return notVal;
    }
}
