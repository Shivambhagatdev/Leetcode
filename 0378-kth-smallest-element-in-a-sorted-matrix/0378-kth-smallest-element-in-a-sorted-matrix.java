class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;
        int lo=matrix[0][0];
        int hi=matrix[n-1][n-1];
        while(lo<hi){
          int mid = lo + (hi - lo) / 2;
            int count=Countlessthan(matrix,mid);
            if(count<k){
                lo=mid+1;
            }else{
                hi=mid;
            }
        }
         return lo;
    }
    public int Countlessthan(int[][] matrix,int target){
        int count=0;
        for(int[] row:matrix){
            int left=0;
            int right=row.length;
            while(left<right){
             int mid = left + (right - left) / 2;
               if(row[mid]<=target){
                left=mid+1;
               }else{
                right=mid;
               } 
               } 
                count+=left;          
        }
       return count;
    }

}