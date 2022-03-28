class Solution {
    public String restoreString(String s, int[] indices) {
    int n=s.length();
    char arr[]=new char[n];
    for(int i = 0; i<n; i++) {
        arr[indices[i]] = s.charAt(i);  //arr[indices[i]]=s.charAt(i) => arr[4]=c => c will store at 4 indix in arr
    }
        return new String(arr); //here we return the new string where we shuffled
    }
}
