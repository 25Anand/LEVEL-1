class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=1;  
        if(num==1){
            return false;
        }
        int a=(int)Math.sqrt(num);
        for(int i=2;i<=a;i++){
             if(num%i==0){
                  sum=sum+i+num/i;
              }
            }
      return num==sum;
    }
}
