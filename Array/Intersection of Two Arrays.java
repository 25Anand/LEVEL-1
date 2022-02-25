class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {   
        
        Set<Integer> Set2=new HashSet<>();
        Set<Integer> Set1=new HashSet<>();
        for(int i:nums1){
            Set1.add(i);
        }
        for(int i:nums2){
            if(Set1.contains(i)){
                Set2.add(i);
            }
        }
         
        int []result=new int[Set2.size()];
        int j=0;
        for(int i:Set2){
            result[j++]=i;
        }
        return result;
    }
}
