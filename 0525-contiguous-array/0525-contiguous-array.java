class Solution {
    public int findMaxLength(int[] nums) {
    int[] prefix=new int[nums.length];
    HashMap<Integer,Integer> map=new HashMap<>();
    if(nums[0]==0) prefix[0]=-1;
    else prefix[0]=1;
    for(int i=1;i<nums.length;i++){
        if(nums[i]==0) {
            prefix[i]=prefix[i-1]-1;
        }else{
            prefix[i]=prefix[i-1]+1;
        }
    }
    int ans=0;
    map.put(0,-1);
    for(int i=0;i<nums.length;i++){
        if(map.containsKey(prefix[i])){
         ans = Math.max(ans, i - map.get(prefix[i]));
        }else{
        map.put(prefix[i],i);
    }
    }
    return ans;
    }
}