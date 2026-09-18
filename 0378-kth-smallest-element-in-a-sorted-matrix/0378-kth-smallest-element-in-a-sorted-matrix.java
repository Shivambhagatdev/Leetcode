class Solution {
    public int kthSmallest(int[][] matrix, int k) {

        int n = matrix.length;

        int low = matrix[0][0];
        int high = matrix[n - 1][n - 1];

        while (low < high) {

            int mid = low + (high - low) / 2;

            int count = countLessEqual(matrix, mid);

            if (count < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    public int countLessEqual(int[][] matrix, int target) {

        int count = 0;

        for (int[] row : matrix) {

            int left = 0;
            int right = row.length;

            // Upper Bound: first element > target
            while (left < right) {

                int mid = left + (right - left) / 2;

                if (row[mid] <= target) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }

            count += left;
        }

        return count;
    }
}