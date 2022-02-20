SOLUTION 1:-->1ms,91.89%

       class Solution {
        public void reverseString(char[] s) {
        int front=0;
        int back=s.length-1;
        while(front<back){
        char str=s[front];
        s[front]=s[back];
        s[back]=str;
        front++;
        back--;
        }
    }
}
        
        
 SOLUTION 2:-->0ms,100.00%
 
        class Solution {
        public void reverseString(char[] s) {
        
        for(int i=0;i<(s.length)/2;i++){
         char str=s[i];
         s[i]=s[s.length-1-i];
         s[s.length-1-i]=str;
        }
    }
}
