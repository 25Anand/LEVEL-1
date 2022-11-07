class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int res,min =Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                res=Math.abs(i-start);
                if(res<min){
                    min=res;
                }
            }
        }
        return min; 
    }
}
