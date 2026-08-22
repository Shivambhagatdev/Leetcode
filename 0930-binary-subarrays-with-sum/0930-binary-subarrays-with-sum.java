class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
     HashMap<Integer,Integer> map= new HashMap<>();
     int prefix=0;
     int ans=0;
     map.put(0,1);
     for(int i=0;i<nums.length;i++){
        prefix+=nums[i];
        int oldPrefix=prefix-goal;
        if(map.containsKey(oldPrefix)){
          ans+=map.get(oldPrefix);
        }
        if(map.containsKey(prefix)){
            map.put(prefix,map.get(prefix)+1);
        }else{
            map.put(prefix,1);
        }
     }
     return ans;
    }
}