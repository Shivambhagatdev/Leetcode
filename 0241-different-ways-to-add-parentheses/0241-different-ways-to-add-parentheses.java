class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        return solve(expression);
    }
    public List<Integer> solve(String exp){
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            if(ch=='+'||ch=='-'||ch=='*'){
                String left=exp.substring(0,i);
                String right=exp.substring(i+1);

                List<Integer> leftAns=solve(left);
                List<Integer> rightAns=solve(right);

                for(int a:leftAns){
                    for(int b:rightAns){
                        if(ch=='+'){
                            ans.add(a+b);
                        }
                       else if(ch=='-'){
                            ans.add(a-b);
                        }
                        else{
                            ans.add(a*b);
                        }
                    }
                }
            }
        }
         if (ans.size() == 0) {
            ans.add(Integer.parseInt(exp));
        }

        return ans;
    }
}