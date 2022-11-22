class Solution {
    public int countKDifference(int[] nums, int k) {
        int count=0,i=0,j=i+1; 
        while(i<nums.length){
            for(j=i+1;j<nums.length;j++){
                if(nums[i]-nums[j]==k || nums[i]-nums[j]==-k )count++;
            }
            i++;
        }
        return count;
    }
}
