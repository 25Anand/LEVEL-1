class Solution {
    public String reverseWords(String s) {
         String words[] = s.split(" +");
        StringBuilder str=new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            str.append(words[i]);
            str.append(" ");
        }
        return str.toString().trim();
        
    }
}
