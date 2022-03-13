class Solution {
    String firstAlphabet(String S) {
        // code here
        S=" "+S;
        String s1="";
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)==' ')
            {
               s1=s1+S.charAt(i+1);
            }
        }
        return s1;
    }
}
