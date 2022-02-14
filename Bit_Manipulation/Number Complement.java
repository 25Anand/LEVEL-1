class Solution {
    public int findComplement(int num) {
        int a=1,b=0;
        while(num!=0){
            if((num&1)==0){
                b=b+(1*a);
            }
            a=a*2;
            num=num>>1;
        }
        return b;
    }
}
