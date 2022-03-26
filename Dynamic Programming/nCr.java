class Solution{
    static int nCr(int n, int r)
    {
        // code here
        if(n<r)
        {
            return 0;
        }
        int mod=1000000007;
        int[][] dp=new int[n+1][r+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=Math.min(i,r);j++)
            {
                if(j==0||i==j)
                {
                    dp[i][j]=1;
                }
                else
                {
                    dp[i][j]=(dp[i-1][j]+dp[i-1][j-1])%mod;
                }
            }
        }
        return dp[n][r];
        
    }
}
