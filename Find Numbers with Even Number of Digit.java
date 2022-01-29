class Solution {
    public int findNumbers(int[] nums) {
        int a=0;
        for(int i=0;i<nums.length;i++)
        {
            int temp=nums[i];
            int count=0;
            while(temp>0){
                temp=temp/10;
                count++;
            }
            if(count%2==0){
                a++;
            }
            
        }
        return a;
    }
}
