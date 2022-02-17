class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        // if(timeSeries.length==0 || duration==0)
        //     return 0;
        int result=0;
       
        for(int i=1;i<timeSeries.length;i++){
                result=result+Math.min(duration,timeSeries[i]-timeSeries[i-1]);
            }
        
        return result+duration;
    }
}
