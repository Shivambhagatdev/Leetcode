class Solution {
    public int[] leftRightDifference(int[] nums) {
       int[] leftSum=new int[nums.length];
       int[] rightSum=new int[nums.length];
       leftSum[0]=0;
       rightSum[nums.length-1]=0;
       int total_sum=0;
        for(int i=0;i<nums.length;i++){
            total_sum += nums[i];
        }
       for(int i=1;i<nums.length;i++){
         leftSum[i]=leftSum[i-1]+nums[i-1];
       }
       for (int i = 0; i < nums.length; i++) {
            rightSum[i] = total_sum - leftSum[i] - nums[i];
        }
       
       int[] answer=new int[nums.length];
       for(int i=0;i<nums.length;i++){
        answer[i]=Math.abs(leftSum[i]-rightSum[i]);
       }
       return answer;
    }
}