class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        boolean[] visited=new boolean[n];
        visited[0]=true;
        while(q.size()>0){
            int front=q.remove();
            for(int num:rooms.get(front)){
                if(!visited[num]){
                    q.add(num);
                    visited[num]=true;
                }
            }
        }
        for(boolean flag:visited){
            if(!flag) return false;
        }
        return true;
    }
}