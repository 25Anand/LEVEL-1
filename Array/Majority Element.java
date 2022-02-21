SOLUTION 1:--->
--------------------------------------------
class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int temp=nums[0];
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==temp){
                count++;
            } else {
              count--;
            }
            if(count==0){
                temp=nums[i];
                count=1;
            }
        }
        return temp;
    }
}

SOLUTION 2:--->
---------------------------------------------
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
        
    }
}
