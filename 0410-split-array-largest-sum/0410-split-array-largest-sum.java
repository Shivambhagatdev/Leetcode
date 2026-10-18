class Solution {
    public int splitArray(int[] nums, int k) {
      int lo=0;
      int hi=0;
      for(int num:nums){
        lo=Math.max(lo,num);
        hi+=num;
      }
      while(lo<hi){
        int mid=(lo+hi)/2;
        int parts=1;
        int currentSum=0;
        for(int num:nums){
            if(currentSum+num>mid){
                parts++;
                currentSum=num;
            }else{
                currentSum+=num;
            }
        }
        if(parts>k){
            lo=mid+1;
        }else{
            hi=mid;
        }
      }
      return lo;
    }
}