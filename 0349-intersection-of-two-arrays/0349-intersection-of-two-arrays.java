class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> ans=new HashSet<>();
        for(int ele : nums1){
            set.add(ele);
        }
        for(int i =0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                ans.add(nums2[i]);
            }
        }
        int[] res=new int[ans.size()];
        int index=0;
        for(int x:ans){
            res[index]=x;
            index++;
        }
        return res;
    }
}