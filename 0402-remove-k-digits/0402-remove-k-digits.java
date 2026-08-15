import java.util.*;

class Solution {
    public String removeKdigits(String num, int k) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < num.length(); i++) {

            while (!st.isEmpty() &&
                   k > 0 &&
                   st.peek() > num.charAt(i)) {

                st.pop();
                k--;
            }

            st.push(num.charAt(i));
        }

        while (k > 0) {
            st.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();

        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        sb.reverse();

        // If all digits were removed
        if (sb.length() == 0) {
            return "0";
        }

        // Remove leading zeros
        int i = 0;

        while (i < sb.length() - 1 && sb.charAt(i) == '0') {
            i++;
        }

        return sb.substring(i);
    }
}