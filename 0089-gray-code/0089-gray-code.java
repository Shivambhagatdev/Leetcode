class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<(1<<n);i++){
            int result=i^(i>>1);
            list.add(result);
        }
        return list;
    }
}