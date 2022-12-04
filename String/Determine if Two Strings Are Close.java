class Solution {
    public boolean closeStrings(String word1, String word2) {
        Map<Character,Integer> m1= new HashMap<>();
        Map<Character,Integer> m2= new HashMap<>();
        
        for(char c:word1.toCharArray()){
            m1.put(c,m1.getOrDefault(c,0)+1);
        }
        
        for(char c:word2.toCharArray()){
            m2.put(c,m2.getOrDefault(c,0)+1);
        }
        
        if(!m1.keySet().equals(m2.keySet())){
            return false;
        }
        List<Integer> w1=new ArrayList<>(m1.values());
        List<Integer> w2=new ArrayList<>(m2.values());
        Collections.sort(w1);
        Collections.sort(w2);

        return w1.equals(w2);

    }
}
