class Solution {
    public int numSquares(int n) {
        int a[]=new int[n+1];
        a[0]=0;
        a[1]=1;
        
        for(int i=2;i<=n;i++){
            int min=Integer.MAX_VALUE;
            for(int j=1;j*j<=i;j++){
                int t=i-j*j;
                if(a[t]<min)
                    min=a[t];
            }
            a[i]=min+1;
        }
        return a[n];
    }
}