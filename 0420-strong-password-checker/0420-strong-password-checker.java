class Solution {
    public int strongPasswordChecker(String password) {
        int n=password.length();
        boolean lower=false;
        boolean upper=false;
        boolean digit=false;

        for(char c:password.toCharArray()){
            if(c>='a'&&c<='z'){
                lower=true;
            }
            else if(c>='A'&&c<='Z'){
                upper=true;
            }else if(c>='0'&&c<='9'){
                digit=true;
            }
        }
        int missing=0;
        if(!lower) missing++;
        if(!upper) missing++;
        if(!digit) missing++;

        int[] mod=new int[3];
        int replacements=0;
        for(int i=0;i<n;){
            int j=i;
            while(j < n &&
                   password.charAt(j) == password.charAt(i)) {
                j++;
            }
            int len=j-i;
            if (len >= 3) {
                replacements += len / 3;
                mod[len % 3]++;
            }
            i=j;
        }
        if(n<6){
            return  Math.max(6-n,missing);
        }
        if(n<=20){
            return Math.max(replacements,missing);
        }

        int deletions = n - 20;
        int remaining = deletions;

        int use = Math.min(mod[0], remaining);
        replacements -= use;
        remaining -= use;

        use = Math.min(mod[1], remaining / 2);
        replacements -= use;
        remaining -= use * 2;

        use = remaining / 3;
        replacements -= use;

        replacements = Math.max(0, replacements);

        return deletions + Math.max(missing, replacements);

    }
}