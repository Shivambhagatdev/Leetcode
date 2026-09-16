class Solution {
    public int findKthLargest(int[] nums, int k) {
    mergeSort(nums,0,nums.length-1);
    return nums[nums.length-k];
    }
    public void mergeSort(int[] nums,int st,int end){
        if(st>=end){
            return;
        }
        int mid=(st+end)/2;
        mergeSort(nums,st,mid);
        mergeSort(nums,mid+1,end);
        merge(nums,st,mid,end);
    }
    public void merge(int[] nums,int st,int mid,int end){
        int i=st;int j=mid+1;int k=0;
        int[] temp=new int[end-st+1];
        while(i<=mid&&j<=end){
            if(nums[i]<nums[j]){
                temp[k]=nums[i];
                i++;
            }else{
                temp[k]=nums[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k]=nums[i];
            i++;k++;
        }
        while(j<=end){
            temp[k]=nums[j];
            j++;k++;
        }
        for(int l=0;l<temp.length;l++){
            nums[st+l]=temp[l];
        }
    }
}