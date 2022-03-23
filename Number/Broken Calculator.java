class Solution {
    public int brokenCalc(int startValue, int target) {
    if(startValue==target)
         return 0;
    if(startValue>=target)
        return startValue-target;
    int res=0;
    if(target%2==0){
        res=1+brokenCalc(startValue,target/2);
    }else{
        res=1+brokenCalc(startValue,target+1);
    }
    return res;
    }
}
