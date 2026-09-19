class Solution {
    public int findBestValue(int[] arr, int target) {
        Arrays.sort(arr);
        int left=0;
        int right=arr[arr.length-1];
        while(left<=right){
            int mid=left+(right-left)/2;
            int sum=0;
            for(int num:arr){
                sum+=Math.min(num,mid);
            }
            if(sum<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        int leftSum=0;
        int rightSum=0;
        for(int num:arr){
            leftSum+=Math.min(left,num);
            rightSum+=Math.min(right,num);
        }
        if(Math.abs(rightSum-target)<=Math.abs(leftSum-target)){
            return right;
        }
        return left;
    }
}