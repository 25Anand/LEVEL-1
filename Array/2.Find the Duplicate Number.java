/*SOLUTION 1--> Using a HashSet to record the occurrence of each number
        
Analysis:
    Time Complexity: O(n)
    Space Complexity: O(n)*/

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

/*SOLUTION 2--->Sorting the array first, then use a loop from 1 to n.
        
        Analysis
                Time Complexity: O(nlogn)
                Space Complexity: O(logn) */

class Solution {
    public int findDuplicate(int[] nums) {
       int n=nums.length;
        Arrays.sort(nums);
        for(int i=1;i<n;i++){
                if(nums[i]==nums[i-1]){
                    return nums[i];
                }
            }
        return n;
    }
}


/*SOLUTION 3--->Count the frequency of the num in the array.
        Analysis:
                Time Complexity: O(n)
                Space Complexity: O(n) */ 
public static int findDuplicate(int[] nums) {
        int len = nums.length;
        int[] cnt = new int[len + 1];
        for (int i = 0; i < len; i++) {
            cnt[nums[i]]++;
            if (cnt[nums[i]] > 1) {
                return nums[i];
            }
        }

        return len;
    }

 
