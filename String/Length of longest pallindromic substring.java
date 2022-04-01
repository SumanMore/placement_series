class Solution{
    static String longestPalin(String S){
        // code here
        int dp[][]=new int[S.length()][S.length()];
        int l=0;
        for(int gap=0;gap<S.length();gap++)
        {
            for(int i=0,j=gap;j<S.length();i++,j++)
            {
                if(gap==0)
                {
                    dp[i][j]=1;
                }
                else if(gap==1)
                {
                    if(S.charAt(i)==S.charAt(j))
                    {
                        dp[i][j]=1;
                        
                    }
                    else
                    {
                        dp[i][j]=0;
                    }
                }
                else
                {
                    if(S.charAt(i)==S.charAt(j) && dp[i+1][j-1]==1)
                    
                    {
                        dp[i][j]=1;
                    }
                    else
                    {
                        dp[i][j]=0;
                    }
                }
              if(dp[i][j]==1)
              {
                 l=gap+1;
              }
            }
        }
        return l;
    }
}
