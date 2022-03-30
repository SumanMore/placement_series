class Solution
{
    public static int max_xor(int arr[], int n)
    {
        //code here
        int m=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                m=Math.max(m,arr[i]^arr[j]);
            }
        }
        return m;
    }
}
