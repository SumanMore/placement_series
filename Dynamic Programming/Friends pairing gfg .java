class Solution
{
    public long countFriendsPairings(int n) 
    { 
       //code here
       if(n == 0) return 0;
       if(n == 1) return 1;
       long dp[] = new long[n+1];
       dp[1] = 1;
       dp[2] = 2;
       
       for(int i=3; i<=n; i++){
           dp[i] = (dp[i-1] + (dp[i-2]*(i-1))) % 1000000007;
       }
       
       return dp[n] % 1000000007;
    }
}    
