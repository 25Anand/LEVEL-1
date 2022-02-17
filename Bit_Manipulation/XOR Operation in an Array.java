class Solution {
    public int xorOperation(int n, int start) {
        
        int nums[]=new int[n];
        n=nums.length;
        for(int i=0;i<n;i++){
            nums[i] = start + 2 * i;
        }
        int result=0;
        for(int a:nums){
        result^=a;
        }
        return result;
    }
}
