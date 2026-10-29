import java.util.*;

class Solution {
    public int findMaximumXOR(int[] nums) {
        int maxXor = 0;
        int mask = 0;

        for (int bit = 30; bit >= 0; bit--) {

            // Current bit ko mask mein include karo
            mask |= (1 << bit);

            Set<Integer> prefixes = new HashSet<>();

            // Har number ka relevant prefix store karo
            for (int num : nums) {
                prefixes.add(num & mask);
            }

            // Try karo ki current bit ko 1 banane par kya hoga
            int candidate = maxXor | (1 << bit);

            for (int prefix : prefixes) {
                int required = prefix ^ candidate;

                if (prefixes.contains(required)) {
                    maxXor = candidate;
                    break;
                }
            }
        }

        return maxXor;
    }
}