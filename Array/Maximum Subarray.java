
SOLUTION 1 --->
    
class Solution {
    public int maxSubArray(int[] nums) 
    {
          int maxSum = nums[0];
        for(int i=1;i<nums.length;i++)
        {  
           if(nums[i-1]>0) nums[i] = nums[i-1]+nums[i];
        	if(maxSum<nums[i]) maxSum = nums[i];
        }
        return maxSum;
      }
}

SOLUTION 2--->
    
class Solution {
    public int maxSubArray(int[] nums) 
    {
        
        int curSum=0;
        int maxSum=nums[0];
        
        for(int i=0;i<nums.length;i++){
            curSum=curSum+nums[i];
            if(curSum>maxSum){
                maxSum=curSum;
            }
            if(curSum<0){
                curSum=0;
            }
        }
        return maxSum;
      }
}
