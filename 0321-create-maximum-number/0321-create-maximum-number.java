
class Solution {

    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        int m = nums1.length;
        int n = nums2.length;

        int[] best = new int[k];

        for (int i = Math.max(0, k - n);
             i <= Math.min(k, m); i++) {

            int[] a = maxSubsequence(nums1, i);
            int[] b = maxSubsequence(nums2, k - i);

            int[] candidate = merge(a, b);

            if (greater(candidate, 0, best, 0)) {
                best = candidate;
            }
        }

        return best;
    }

    private int[] maxSubsequence(int[] nums, int k) {
        int[] stack = new int[k];
        int top = 0;
        int drop = nums.length - k;

        for (int num : nums) {
            while (top > 0 && drop > 0
                    && stack[top - 1] < num) {
                top--;
                drop--;
            }

            if (top < k) {
                stack[top++] = num;
            } else {
                drop--;
            }
        }

        return stack;
    }

    private int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int i = 0, j = 0;

        for (int r = 0; r < result.length; r++) {
            if (greater(a, i, b, j)) {
                result[r] = a[i++];
            } else {
                result[r] = b[j++];
            }
        }

        return result;
    }

    private boolean greater(int[] a, int i, int[] b, int j) {
        while (i < a.length && j < b.length
                && a[i] == b[j]) {
            i++;
            j++;
        }

        if (j == b.length) return true;
        if (i == a.length) return false;

        return a[i] > b[j];
    }
}
