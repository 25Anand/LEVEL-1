class Solution {
    public int maximum69Number (int num) {
        char[] numValue=String.valueOf(num).toCharArray();
        for(int i=0;i<numValue.length;i++){
            if(numValue[i]=='6') {
                numValue[i] = '9';
                break;
            }
        }
        
        return Integer.valueOf(new String(numValue));
    }
}
