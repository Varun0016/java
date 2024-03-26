import java.util.Arrays;

public class KthLargestElement {

    public static int LargestElement(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 1 || k > nums.length)
            throw new IllegalArgumentException("Invalid input");

        Arrays.sort(nums);

        return nums[nums.length - k];
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4}; 
        int k = 2; 
        int result = LargestElement(nums, k);
        System.out.println("The " + k + "th largest element is: " + result);
    }
}
