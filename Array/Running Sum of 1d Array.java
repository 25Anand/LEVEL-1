class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int sum=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            sum+=nums[i];
            arr[i]=sum;
        }
        return arr;
    }
}
