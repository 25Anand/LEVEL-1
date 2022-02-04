class Solution {
    public int fib(int n) {
        int x=0, y=1;
        if(n<=1){
            return n;
        }
        for(int i=2;i<=n;i++)
        {
         int A=x+y;
            x=y;
            y=A;
        }
        return y;
    }
}
