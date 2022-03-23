class Compute
{
    boolean find4Numbers(int A[], int n, int X) 
    {
         for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            for(int k=j+1;k<n;k++)
            {
                for(int l=k+1;l<n;l++)
                {
                    if(A[i]+A[j]+A[k]+A[l]==X)
                    {
                        return true;
                    }
                }
            }
        }
    }
    return false;
    }
}
