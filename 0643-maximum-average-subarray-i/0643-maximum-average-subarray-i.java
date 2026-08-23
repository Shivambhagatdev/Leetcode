class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double max=sum/k;
        for(int i=k;i<nums.length;i++){
            sum-=nums[i-k];
            sum+=nums[i];
            double avg=(sum)/k;
            max=Math.max(max,avg);
        }
        return max;
    }
}