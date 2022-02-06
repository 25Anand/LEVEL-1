class Solution {
    public boolean judgeSquareSum(int c) {
        // if(c<0){
        //      return false;
        // }
        int a=0, b=(int)(Math.sqrt(c));
        while(a<=b)
        {
            int sum=(a*a)+(b*b);
            if(sum<0)
            {
                b--;
            }
            if(sum == c)
            {
                return true;
            }
            if(sum < c)
            {
                a++;
            }
             else{
                b--; 
            }
        }
        return false;
    } 
}
