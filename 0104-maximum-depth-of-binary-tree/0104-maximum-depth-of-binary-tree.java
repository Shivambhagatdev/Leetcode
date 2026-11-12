class Solution {
    public int maxDepth(TreeNode root) {
      if(root==null) return 0;
      int depth=0;
      Queue<TreeNode> q=new LinkedList<>();
      q.add(root);
      while(!q.isEmpty()){
        int size=q.size();
        for(int i=0;i<size;i++){
            TreeNode curr=q.remove();
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
        depth++;
      }  
      return depth;
    }
}