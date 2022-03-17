class Solution {
    public int[] shuffle(int[] nums, int n) {
      
        int[] a=new int[2*n];
        a[0] = nums[0];
        a[1] = nums[n];
        for(int i=0;i<n;i++){
            a[2*i]=nums[i];
            a[2*i + 1]= nums[n+i];       
        }
      return a;
    }
}

// SOLUTION 2----> 
  class Solution {
    public int[] shuffle(int[] nums, int n) {
      
        int[] a=new int[2*n];
        int s=0,t=n;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                a[i]=nums[s];
                s++;
            }else{
                a[i]=nums[t];
                t++;
            }
      }
      return a;
    }
}
  
