class Solution {
    public boolean isPerfectSquare(int num) {
         long t=num;
        while(t*t>num){
            t=(t+num/t)/2;
        }
        return t*t==num;
    }
}
