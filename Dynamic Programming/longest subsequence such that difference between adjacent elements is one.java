class Solution{
    static int longestSubsequence(int N, int A[])
    {
        // code here
        int dp[]=new int[N];
            for(int  i = 0 ;  i < N ; i ++)
       {
           dp[i] = 1;
       }
       
        for(int i=1;i<N;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(Math.abs(A[i]-A[j])==1)
                {
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
        int res=dp[0];
        for(int i=1;i<dp.length;i++)
        {
            res=Math.max(res,dp[i]);
        }
        return res;
    }
}
