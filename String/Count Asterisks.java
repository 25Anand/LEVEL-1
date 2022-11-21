class Solution {
    public int countAsterisks(String s) {
        int count=0,bar=0;
        for(char c:s.toCharArray()){
            if(c=='|'){
                bar++;
            }
            if(bar%2==0 && c=='*'){
                count++;
            }
        }
        return count;
    }
}
