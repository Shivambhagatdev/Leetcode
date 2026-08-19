class Solution {
    public String mergeAlternately(String word1, String word2) {
        String str="";
        int n=word1.length();
        int m=word2.length();
        int k=0;int j=0;
        for(int i=0;i<n+m;i++){
        if(k<n&&j<m){
            if(i%2==0){
                str+=word1.charAt(k);
                k++;
            }else{
                str+=word2.charAt(j);
                j++;
            }
        }
        else if(k<n){
            str+=word1.charAt(k);
            k++;
        }else{
            str+=word2.charAt(j);
            j++;
        }
        }
        return str;
    }
}