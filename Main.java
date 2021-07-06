import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = { 5, 4, 1, 2, 9, 7, 3, 8, 6, 0 };
        Arrays.sort(nums);

        for (int i = 0, j = nums.length - 1, tmp; i < j; i++, j--) {
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println("nums[" + i + "] = " + nums[i]);
        }
    }
}