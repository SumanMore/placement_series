class Solution{
    int longestCommonSubstr(String S1, String S2, int n, int m){
        // code here
        int t[][]=new int[n+1][m+1];
        for(int i=0;i<=S1.length();i++)
        {
            t[i][0]=0;
        }
        for(int j=0;j<=S2.length();j++)
        {
            t[0][j]=0;
        }
        for(int i=1;i<=S1.length();i++)
        {
            for(int j=1;j<=S2.length();j++)
            {
                if(S1.charAt(i-1)!=S2.charAt(j-1))
                {
                    t[i][j]=0;
                }
                else
                {
                    t[i][j]=1+t[i-1][j-1];
                }
            }
        }
        int res=0;
         for(int i=0;i<=S1.length();i++)
        {
        
        for(int j=0;j<=S2.length();j++)
        {
            res=Math.max(res,t[i][j]);
        }
        
    }
    return res;
    }
}
