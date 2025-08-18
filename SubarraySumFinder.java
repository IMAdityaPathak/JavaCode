package gs;



public class SubarraySumFinder {
    public static void main(String[] args) {
        int[] arr = {12, 7, 29, 6, 2, 11, 4, 8};
        int targetSum = 19;

        System.out.println("Subarrays with sum " + targetSum + ":");
        findSubarraysWithSum(arr, targetSum);
    }

    public static void findSubarraysWithSum(int[] arr, int targetSum) {
        int n = arr.length;

        for (int start = 0; start < n; start++) {
            int sum = 0;
            for (int end = start; end < n; end++) {
                sum += arr[end];

                if (sum == targetSum) {
                    // Print the subarray
                    System.out.print("[");
                    for (int i = start; i <= end; i++) {
                        System.out.print(arr[i]);
                        if (i < end) System.out.print(", ");
                    }
                    System.out.println("]");
                }
            }
        }
    }
}




//Given an unsorted array A of size N, find a continuous sub-array which  sums up to S.
//For example if the input array is [ 12,7,29,6, 2, 11,4,8] and the  expected sum is 8, then there are two possibilities [6,2] and [8]

