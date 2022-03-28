class Solution
{
	public int maxSumIS(int arr[], int n)  
	{  
	    //code here.
	    
	    int dp[]=new int[n];
       for(int i=0;i<n;i++)
       {
           dp[i]=arr[i];
       }
       int sum=0;
       for(int i = 1; i < n; i++){
           for(int j = 0; j < i; j++){
               if(arr[j] < arr[i])
               {
                dp[i] = Math.max(dp[i], dp[j]+arr[i]);
                  
               }
               
           }
       }
       int res=dp[0];
       for(int i=1;i<n;i++)
       {
           res=Math.max(res,dp[i]);
       }
       return res;
       
	}  
}
