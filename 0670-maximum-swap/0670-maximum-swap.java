class Solution {
    public int maximumSwap(int num) {

        char[] arr = String.valueOf(num).toCharArray();

        // Last occurrence of every digit
        int[] last = new int[10];

        for (int i = 0; i < arr.length; i++) {
            last[arr[i] - '0'] = i;
        }

        // Greedy
        for (int i = 0; i < arr.length; i++) {

            int current = arr[i] - '0';

            // Try bigger digits
            for (int digit = 9; digit > current; digit--) {

                // Bigger digit exists on right side
                if (last[digit] > i) {

                    int j = last[digit];

                    // Swap
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    return Integer.parseInt(new String(arr));
                }
            }
        }

        return num;
    }
}