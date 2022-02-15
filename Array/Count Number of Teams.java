class Solution {
    public int numTeams(int[] rating) {
        int count=0;
        int A[]=new int[rating.length];
        for(int i=0;i<rating.length;i++){
            for(int j=i;j>=0;j--){
                if(rating[i]>rating[j]){
                    A[i]++;
                    count=count+A[j];
                }
            }
        }
        A=new int[rating.length];
        for(int i=0;i<rating.length;i++){
            for(int j=i;j>=0;j--){
                if(rating[i]<rating[j]){
                    A[i]++;
                    count=count+A[j];
                }
            }
            
        }
        return count;
        
    }
}
