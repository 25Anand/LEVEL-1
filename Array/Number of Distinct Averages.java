class Solution {
    public int distinctAverages(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        Set<Integer> ans=new HashSet<>();
        for(int i=0;i<n;i++){
            ans.add(nums[i]+nums[n-1-i]);
        }
        
        return ans.size();
    }
}
