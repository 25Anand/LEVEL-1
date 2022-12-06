class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> cnt=new HashMap<>();
        for(char c:s.toCharArray()){
            cnt.put(c,cnt.getOrDefault(c,0)+1);
        }
        PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->cnt.get(b)-cnt.get(a));
    
        for(char c:cnt.keySet()){
            pq.add(c);
            }
        StringBuilder sb=new StringBuilder();
        while(!pq.isEmpty()){
            char c=pq.poll();
            int count=cnt.get(c);
            
            while(count-- > 0){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
