package gs;

import java.util.*;

public class SubarraySum {
    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int targetSum = 33;

        findSubarrayWithSum(arr, targetSum);
    }

    public static void findSubarrayWithSum(int[] arr, int targetSum) {
        int start = 0, currentSum = arr[0];

        for (int end = 1; end <= arr.length; end++) {
            // Shrink the window if currentSum exceeds target
            while (currentSum > targetSum && start < end - 1) {
                currentSum -= arr[start];
                start++;
            }

            // Check if current window matches the target sum
            if (currentSum == targetSum) {
                System.out.println("Subarray found from index " + start + " to " + (end - 1));
                return;
            }

            // Expand the window
            if (end < arr.length) {
                currentSum += arr[end];
            }
        }

        System.out.println("No subarray found with the given sum.");
    }
}
