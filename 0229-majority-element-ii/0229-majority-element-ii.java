class Solution {
    public List<Integer> majorityElement(int[] nums) {
       HashMap<Integer,Integer> map=new HashMap<>();
       List<Integer> list=new ArrayList<>();
       for(int i=0;i<nums.length;i++){
        if(map.containsKey(nums[i])){
            map.put(nums[i],map.get(nums[i])+1);
        }else{
            map.put(nums[i],1);
        }
       } 
       for(int num: map.keySet()){
        if(map.get(num)>(nums.length/3)){
        list.add(num);
        }
       }
       return list;
    }
}