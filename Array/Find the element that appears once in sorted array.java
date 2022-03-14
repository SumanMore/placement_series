class Solution 
{
    int findOnce(int arr[], int n)
    {
        
        int x = 0;
       for(int i = 0 ; i<n ; i++)
       {
           x = x ^ arr[i];
       }
       return x;
    }
}
