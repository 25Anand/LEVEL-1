class Solution {
    public int countPairs(int[] nums, int k) {
        // int n=nums.length;
        int count=0;
        // int t;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(0<=i && i<j && j<nums.length)
                {
                    if(nums[i]==nums[j])
                    {
                        if((i*j)%k==0)
                        {
                            count++;
                        }
                     }
                }
            }
        }
        return count;
    }
}
