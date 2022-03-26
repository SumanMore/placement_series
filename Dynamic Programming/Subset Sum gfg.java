class Solution{


    static Boolean isSubsetSum(int N, int arr[], int sum){
        // code here
        int a[][]=new int[N+1][sum+1];
        for(int i=0;i<=N;i++)
        {
            a[i][0]=1;
        }
        for(int i=1;i<=N;i++)
        {
            for(int j=1;j<=sum;j++)
            {
                if(arr[i-1]>j)
                {
                    a[i][j]=a[i-1][j];
                }
                else
                {
                    if(a[i-1][j]==1)
                    {
                        a[i][j]=1;
                    }
                    else
                    {
                    a[i][j]=a[i-1][Math.abs(j-arr[i-1])];
                }
                }
            }
        }
        int res=a[N][sum];
        if(res==0)
        {
            return false;
        }
        return true;
    }
}
