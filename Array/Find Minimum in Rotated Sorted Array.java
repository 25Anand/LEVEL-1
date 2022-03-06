class Solution {
    public int findMin(int[] nums) {
     Arrays.sort(nums);
     int a=0;
     int b=nums.length-1;
     while(a<=b){
         int mid=(a+b)/2 ; //divide by 2
      if(nums[a]<=nums[b])
          return nums[a];
         
        if(mid==a)
            return nums[a];
         
        if(nums[a]<=nums[mid-1]&&nums[mid]<=nums[b]){
            return nums[mid];
            
        }else{
            if(nums[a]<=nums[mid-1]){
                a=mid+1;
            }else{
                b=mid-1;
            }
        }
     }
        return -1;
    }
}