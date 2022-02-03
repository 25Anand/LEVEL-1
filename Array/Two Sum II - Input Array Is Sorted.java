class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start=0, last=numbers.length-1;
        while(start<last){
            int sum = numbers[start]+numbers[last];
            if(sum>target){
                last--;
            }else if(sum<target){
                 start++;
            }else{
                return new int[] {start+1, last+1};
            }
        }
        
        return new int[]{-1,-1};
    }
}
