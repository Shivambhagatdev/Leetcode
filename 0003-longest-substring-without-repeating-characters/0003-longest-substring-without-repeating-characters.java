class Solution {
    public int lengthOfLongestSubstring(String s) {
    HashSet<Character> set=new HashSet<>();
    int n=s.length();
    int i=0,j=0,max=0;
    while(j<n){
        char ch=s.charAt(j);
        if(!set.contains(ch)){
            set.add(ch);
            j++;
        }else{
            int len=j-i;
            max=Math.max(len,max);
            while(s.charAt(i)!=s.charAt(j)){
                set.remove(s.charAt(i));
                i++;
            }
            i++;
            j++;
        } 
    }
    int len =j-i;
    max=Math.max(len ,max);
    return max;
    }
}

//if(s.length()==0) return 0;
    //     HashMap<Character,Integer> map=new HashMap<>();
    //     int right=0;
    //     int max=1;
    //     for(int i=0;i<s.length();i++){
    //         char ch=s.charAt(i);
    //     if(map.containsKey(ch)){
    //        int len=i-right;
    //        right=i;
    //        max=Math.max(len,max);
    //     }else {
    //        map.put(ch,1);
    //  }
    //  }
    //  return max;