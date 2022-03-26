
class Solution 
{
    //Function to find length of longest increasing subsequence.
    static int longestSubsequence(int size, int a[])
    {
         int[] dp=new int[size];
       for(int i = 0; i < size; i++) dp[i] = 1;
       
       for(int i = 1; i < size; i++){
           for(int j = 0; j < i; j++){
               if(a[j] < a[i]){
                   dp[i] = Math.max(dp[i],dp[j]+1);
               }
           }
       }
       
       int mx = 1;
       for(int i = 0; i < size; i++){
           mx = Math.max(mx,dp[i]);
       }
       
       return (mx);
    }
} 
