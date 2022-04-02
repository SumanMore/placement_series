Given a string s consisting of uppercase and lowercase alphabetic characters. Return the  number of distinct substrings of size 2 that appear in s as contiguous substrings.










class Solution 
{ 
    int fun(String s) 
    {
        // code here
        HashSet<String> hs = new HashSet<>();
       for(int i=0; i<s.length()-1; i++){
           hs.add(s.substring(i, i+2));
       }
       return hs.size();
    }
} 
