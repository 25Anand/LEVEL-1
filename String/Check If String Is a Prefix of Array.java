class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder t = new StringBuilder();

    for (String s1: words){
        t.append(s1);
        if (s.equals(t.toString())) return true;
        
    }

    return false;
    }
}
