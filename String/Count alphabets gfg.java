class Solution{
    static int Count(String S)
    {
        // code here
        int c=0;
        S=S.toLowerCase();
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)>='a' && S.charAt(i)<='z')
            {
                c++;
            }
        }
        return c;
    }
}
