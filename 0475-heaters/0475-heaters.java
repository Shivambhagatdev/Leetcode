class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        int ans=0;
        for(int house:houses){
            int left=0;
            int right=heaters.length;
            while(left<right){
                int mid=left+(right-left)/2;
                if(heaters[mid]<house){
                    left=mid+1;
                }else{
                    right=mid;
                }
            }
            int rightdist=Integer.MAX_VALUE;
            int leftdist=Integer.MAX_VALUE;
            if(left<heaters.length){
                rightdist=heaters[left]-house;
            }
            if(left>0){
                leftdist=house-heaters[left-1];
            }
            int nearest=Math.min(rightdist,leftdist);
            ans=Math.max(nearest,ans);
        }
        return ans;
    }
}