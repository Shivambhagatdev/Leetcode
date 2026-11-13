class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
      List<List<Integer>> list= new ArrayList<>();
      Queue<TreeNode> q=new LinkedList<>();
      if (root==null) return list;
      q.add(root);
      while(!q.isEmpty()){
      int n=q.size();
      List<Integer> temp=new ArrayList<>();
      for(int i=0;i<n;i++){
        TreeNode front=q.remove();
        temp.add(front.val);
        if(front.left!=null){
            q.add(front.left);
        }
        if(front.right!=null){
            q.add(front.right);
        }
      }
      list.add(temp);
      } 
      Collections.reverse(list);
      return list;
    }
}