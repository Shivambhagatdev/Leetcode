class Solution {

    public int romanToInt(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int n = s.length();
        int ans = 0;
        int i = 0;

        while(i < n) {

            char ch1 = s.charAt(i);

            if(i < n - 1) {

                char ch = s.charAt(i + 1);

                if(map.get(ch) > map.get(ch1)) {

                    ans += map.get(ch) - map.get(ch1);
                    i += 2;

                } else {

                    ans += map.get(ch1);
                    i++;
                }

            } else {

                ans += map.get(ch1);
                i++;
            }
        }

        return ans;
    }
}