class Solution {
    public int addDigits(int num) {
        if(num==0) return 0;
        int n=num;
        while(n>=10){
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum+=rem;
            n=n/10;
        }
        n=sum;
        }
        return n;
    }
}