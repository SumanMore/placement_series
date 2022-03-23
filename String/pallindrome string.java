class Solution {
    int isPlaindrome(String S) {
        // code here
        String rev="";
        int res=0;
        for(int i=0;i<S.length();i++)
        {
          rev=S.charAt(i)+rev;
        }
        if(rev.equals(S))
           res=1;
        else
           res=0;
        return res;   
          
    }
}
