class Solution {

    public int maxVowels(String s, int k) {

        StringBuilder str = new StringBuilder();

        // First window
        for(int i = 0; i < k; i++) {
            str.append(s.charAt(i));
        }

        int count = 0;

        // Count vowels in first window
        int l = 0;

        while(l < k) {

            char ch = str.charAt(l);

            if(ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u') {

                count++;
            }

            l++;
        }

        int max = count;

        // Sliding window
        for(int i = k; i < s.length(); i++) {

            // Remove first character
            str.deleteCharAt(0);

            // Add new character
            str.append(s.charAt(i));

            // Check outgoing character + incoming character
            char oldChar = s.charAt(i - k);
            char newChar = s.charAt(i);

            if(oldChar == 'a' || oldChar == 'e' || oldChar == 'i' ||
               oldChar == 'o' || oldChar == 'u') {

                count--;
            }

            if(newChar == 'a' || newChar == 'e' || newChar == 'i' ||
               newChar == 'o' || newChar == 'u') {

                count++;
            }

            max = Math.max(max, count);
        }

        return max;
    }
}