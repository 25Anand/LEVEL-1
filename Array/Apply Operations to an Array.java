class Solution {
    public int[] applyOperations(int[] nums) {
        // ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
        }
        MoveZeros(nums);
        return nums;
    }
     public void MoveZeros(int[] nums){
         
         int count=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=0)
			{
				int temp=nums[count];
				nums[count] = nums[i];
				nums[i]= temp;
				count++;
			}
		}
     }
}
