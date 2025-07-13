import java.util.Arrays;
public class ProductArrayExceptSelf {
    
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Step 1: Calculate prefix product
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Step 2: Calculate suffix product and multiply with prefix
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * suffix;
            suffix *= nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] output = productExceptSelf(nums);

        System.out.println("Output array: " + Arrays.toString(output));
    }
}