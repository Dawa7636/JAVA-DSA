import java.util.*;

public class MaxThreeSubarraysWhile {

    public static int[] maxThreeSubarrays(int[] nums, int k) {
        int n = nums.length;

        int[] sum = new int[n - k + 1];
        int i = 0, window = 0;

        while (i < n) {
            window += nums[i];

            if (i >= k) {
                window -= nums[i - k];
            }

            if (i >= k - 1) {
                sum[i - k + 1] = window;
            }
            i++;
        }

        int[] left = new int[sum.length];
        int best = 0;
        i = 0;

        while (i < sum.length) {
            if (sum[i] > sum[best]) {
                best = i;
            }
            left[i] = best;
            i++;
        }

        int[] right = new int[sum.length];
        best = sum.length - 1;
        i = sum.length - 1;

        while (i >= 0) {
            if (sum[i] >= sum[best]) {
                best = i;
            }
            right[i] = best;
            i--;
        }

        int[] res = new int[3];
        int max = 0;

        i = k;
        while (i < sum.length - k) {
            int l = left[i - k];
            int r = right[i + k];

            int total = sum[l] + sum[i] + sum[r];

            if (total > max) {
                max = total;
                res[0] = l;
                res[1] = i;
                res[2] = r;
            }
            i++;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1,2,6,7,5,1};
        int k = 2;

        int[] result = maxThreeSubarrays(nums, k);
        System.out.println(Arrays.toString(result));
    }
}