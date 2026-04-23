public public class SlidingWindowMaxLength {

    public static void findMaxSubarray(int[] arr, int target) {
        int left = 0, right = 0;
        int sum = 0;

        int maxLen = 0;
        int start = -1, end = -1;

        while (right < arr.length) {
            sum += arr[right];

            while (sum > target && left <= right) {
                sum -= arr[left];
                left++;
            }

            if (sum == target) {
                int len = right - left + 1;

                if (len > maxLen) {
                    maxLen = len;
                    start = left;
                    end = right;
                }
            }

            right++;
        }

        if (start != -1) {
            System.out.print("Subarray: ");
            int i = start;
            while (i <= end) {
                System.out.print(arr[i] + " ");
                i++;
            }
            System.out.println("\nLength: " + maxLen);
        } else {
            System.out.println("No subarray found");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 1, 1, 3, 2};
        int target = 5;

        findMaxSubarray(arr, target);
    }
}
