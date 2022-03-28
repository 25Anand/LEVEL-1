class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n=nums.length;
        List<Integer> list=new ArrayList<>(); //create the array list 
        int target[]=new int[n];
        for(int i=0;i<n;i++){
            list.add(index[i],nums[i]);     /*list.add--> add(int index, E element): inserts the element at the given index. 
                                                          The elements from the given index is shifted towards right of the list.*/
        }
         for(int j=0;j<list.size();j++){
                target[j]=list.get(j);          //list.get-->  //The get() method of List interface returns the element at the specified position in this list.
                                                   
            }
        return target;
    }
}
