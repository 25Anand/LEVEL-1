class Solution {
    
    public boolean halvesAreAlike(String s) {
        
//         Set<Character> vowels=Set.of('a','e','i','o','u','A','E','I','O','U');
//         int vowelLeft=0,vowelRight=0,mid=s.length()/2;
//         for(int i=0;i<mid;i++){
//             char charA=s.charAt(i);
//             char charB=s.charAt(mid+i);

//             if(vowels.contains(charA)) vowelLeft++;
            
//             if(vowels.contains(charB)) vowelRight++;
//         }
//         return vowelLeft==vowelRight;
        String s1=s.substring(0,s.length()/2);
        String s2=s.substring(s.length()/2,s.length());
        String vowels="AEIOUaeiou";
        int a=0,b=0;
        for(int i=0;i<s1.length();i++){
            if(vowels.indexOf(s1.charAt(i))>=0)
                a++;
            if(vowels.indexOf(s2.charAt(i))>=0)
                b++;
            }
        return a==b;
    }
}
