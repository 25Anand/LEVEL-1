class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int front =0,back=0;
        for(int i=start;i!=destination;i=(i+1)%distance.length){
            front+=distance[i];
        }
        for(int i=destination;i!=start;i=(i+1)%distance.length)
         back+=distance[i];
        return Math.min(front,back); 
    }
}
