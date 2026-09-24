class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
       Arrays.sort(nums);
       for(int i=0;i<nums.length && k>0;i++){
        if(nums[i]<0){
            nums[i]=-nums[i];
            k--;
        }
       }
       if(k%2==1){
        Arrays.sort(nums);
        nums[0]=-nums[0];
       }
       int sum=0;
       for(int j=0;j<nums.length;j++){
        sum+=nums[j];
       }
       return sum;
    }
}