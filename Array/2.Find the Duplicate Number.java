class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> arr=new HashSet<Integer>();
        
        for(int i:nums){
            if(arr.contains(i)){
                return i;
            }
           arr.add(i);
        }
        return -1;
    }
}
