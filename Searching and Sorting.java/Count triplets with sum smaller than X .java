class Solution
{
    long countTriplets(long arr[], int n,int sum)
    {
     long ans = 0;
      
       
        for (int i = 0; i < n-2; i++)
        {
          
           for (int j = i+1; j < n-1; j++)
           {
               for (int k = j+1; k < n; k++)
                   if (arr[i] + arr[j] + arr[k] < sum)
                       ans++;
           }
        }
      
        return ans;
    }
}
