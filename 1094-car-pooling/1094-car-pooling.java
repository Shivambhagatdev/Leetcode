class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int max=0;
        for(int[] num:trips){
           max=Math.max(num[2],max);
        }
        int[] newTrip=new int[max+1];
        for(int[] trip:trips){
            newTrip[trip[1]]+=trip[0];
            newTrip[trip[2]]-=trip[0];
        }
        int sum=0;
        for(int num :newTrip){
            sum+=num;
            if(sum>capacity){
                return false;
            }
        }
        return true;
    }
}