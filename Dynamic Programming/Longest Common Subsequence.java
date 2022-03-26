class Solution
{
    //Function to find the length of longest common subsequence in two strings.
    static int lcs(int x, int y, String s1, String s2)
    {
        // your code here
        int dp[][]=new int[x+1][y+1];
        for(int i=0;i<=x;i++)
        {
            dp[i][0]=0;
        }
        for(int j=0;j<=y;j++)
        {
            dp[0][j]=0;
        }
        for(int i=1;i<=x;i++)
        {
            for(int j=1;j<=y;j++)
            {
                if(s1.charAt(i-1)!=s2.charAt(j-1))
                {
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
                else
                {
                    dp[i][j]=dp[i-1][j-1]+1;
                }
            }
        }
      
     return dp[x][y];
        
    }
    
}
