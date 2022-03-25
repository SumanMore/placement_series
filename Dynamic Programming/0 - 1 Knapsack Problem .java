class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         // your code here 
         int w[][]=new int[n+1][W+1];
         for(int i=0;i<=n;i++)
         {
             w[i][0]=0;
         }
         for(int j=0;j<=W;j++)
         {
             w[0][j]=0;
         }
         for(int i=1;i<=n;i++)
         {
             for(int j=1;j<=W;j++)
             {
                 if(wt[i-1]>j)
                 {
                   w[i][j]=w[i-1][j];  
                 }
                 else
                 {
                     w[i][j]=Math.max(val[i-1]+w[i-1][j-wt[i-1]],w[i-1][j]);
                 }
             }
         }
         return w[n][W];
    } 
}


