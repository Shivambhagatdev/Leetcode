class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        int left = 0;
        int right = arr.length - k;

        while (left < right) {

            if (x - arr[left] > arr[left + k] - x) {
                left++;
            } else {
                right--;
            }
        }

        List<Integer> list = new ArrayList<>();

        for (int i = left; i < left + k; i++) {
            list.add(arr[i]);
        }

        return list;
    }
}