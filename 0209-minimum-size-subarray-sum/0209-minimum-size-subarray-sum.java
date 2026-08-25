class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int sum=0;
        int j=0;
        int max=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            while(sum>=target){
                max=Math.min(max,i-j+1);
                sum-=nums[j];
                j++;
            }
        }
        return  max == Integer.MAX_VALUE ? 0 : max;
    }
}