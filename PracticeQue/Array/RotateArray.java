package PracticeQue.Array;
import java.util.*;

public class RotateArray {

    // Rotate method takes an array 'nums' and an integer 'k' as input
    public static void rotate(int[] nums, int k) {
        // Get the length of the array
        int n = nums.length;

        // Calculate the effective rotation (in case k is greater than the length of the array)
        k = k % n;

        // Reverse the entire array
        reverse(nums, 0, n - 1);

        // Reverse the first 'k' elements
        reverse(nums, 0, k - 1);

        // Reverse the remaining elements
        reverse(nums, k, n - 1);
    }

    // Helper method to reverse a portion of the array
    private static void reverse(int[] nums, int start, int end) {
        // Use two pointers to swap elements from the start and end until they meet in the middle
        while (start < end) {
            // Swap the elements at 'start' and 'end'
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            // Move the pointers towards the center
            start++;
            end--;
        }
    }

    // Main method for testing the rotate function
    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 3;
        rotate(nums1, k1);
        System.out.println(Arrays.toString(nums1)); // Output: [5, 6, 7, 1, 2, 3, 4]

        // Example 2
        int[] nums2 = {-1, -100, 3, 99};
        int k2 = 2;
        rotate(nums2, k2);
        System.out.println(Arrays.toString(nums2)); // Output: [3, 99, -1, -100]
    }
}
