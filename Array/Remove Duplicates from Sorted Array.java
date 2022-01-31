class Solution {
    public int removeDuplicates(int[] nums) {
        int Count=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1])
            {
               Count++;
            }
        nums[i-Count]=nums[i];
        }
        return nums.length - Count;
    }
}
