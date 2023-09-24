public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        // Initialize arrays for left and right products.
        int[] leftProducts = new int[n];
        int[] rightProducts = new int[n];

        // Initialize the result array.
        int[] result = new int[n];

        // Calculate left products for each element.
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            leftProducts[i] = leftProduct;
            leftProduct *= nums[i];
        }

        // Calculate right products for each element.
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            rightProducts[i] = rightProduct;
            rightProduct *= nums[i];
        }

        // Calculate the result using left and right products.
        for (int i = 0; i < n; i++) {
            result[i] = leftProducts[i] * rightProducts[i];
        }

        return result;
    }
}
