class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int m=0;
        int temp[] = new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0)
                temp[m++]=nums[i];
        }
        if(nums.length==0||nums==null)
            return nums;
            
        for(int i=0;i<nums.length;i++){
            if((nums[i]%2)!=0){
                temp[m++]=nums[i];
            }
                
        }
        // for(int i=0;i<nums.length;i++){
        //     nums[i]=temp[i];
        //     // return nums[i];
        // }
        return temp;
    }
}
