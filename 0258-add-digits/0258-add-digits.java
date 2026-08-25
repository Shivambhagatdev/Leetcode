class Solution {
    public int addDigits(int num) {
        if(num==0) return 0;
        int sum=0;
        int n=num;  
        while(n>0){
            int rem=n%10;
            sum+=rem;
            n=n/10;
            if(sum>9&&n==0){
                n=sum;
                sum=0;
            }
        }
       
        return sum;
    }
}