class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
       int sum=0;
       for(int i=0;i<customers.length;i++){
        if(grumpy[i]==0){
            sum+=customers[i];
        }
       } 
       int sum1=0;
       int max=0;
       for(int i=0;i<minutes;i++){
        if(grumpy[i]==1){
        sum1+=customers[i];}
       }
       max=sum+sum1;
       for(int i=minutes;i<grumpy.length;i++){
          if(grumpy[i]==1){
            sum1=sum1+customers[i];
          }
           if(grumpy[i - minutes] == 1) {
                sum1 -= customers[i - minutes];
            }
           max=Math.max(sum1+sum,max);
       }
       return max;
    }
}