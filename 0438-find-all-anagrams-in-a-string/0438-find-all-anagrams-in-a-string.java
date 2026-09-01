class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       HashMap<Character,Integer> map=new HashMap<>();
       List<Integer> ans= new ArrayList<>();
       if(s.length()<p.length()){
        return ans;
       }
       for(char c:p.toCharArray()){
        map.put(c,map.getOrDefault(c,0)+1);
       }
       HashMap<Character,Integer> window=new HashMap<>();
       int left=0;
       for(int right=0;right<s.length();right++){
        char c=s.charAt(right);
        window.put(c,window.getOrDefault(c,0)+1);
        if(right-left+1>p.length()){
            char remove=s.charAt(left);
             window.put(remove, window.get(remove) - 1);
            if(window.get(remove)==0){
                window.remove(remove);
            }
            left++;
        }
           if (window.equals(map)) {
                ans.add(left);
            }
       }
        return ans;
    }
}